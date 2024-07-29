package javacore.dates.restaurantlogs.services;

import javacore.dates.restaurantlogs.enums.EnumPedido;
import javacore.dates.restaurantlogs.exceptions.InvalidPedidoException;
import javacore.dates.restaurantlogs.repositories.TextRepository;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class RestauranteService {
    private TextRepository repository;

    public RestauranteService(TextRepository repository) {
        this.repository = repository;
    }

    public void registerPedido(int numeroPedido, int quantidadePedido) throws InvalidPedidoException {
        EnumPedido enumPedido = EnumPedido.fromValue(numeroPedido);

        if (enumPedido == null) {
            throw new InvalidPedidoException("Numero de pedido invalido");
        }

        double totalPrice = this.getPrice(enumPedido, quantidadePedido);
        String output = this.buildOutputString(totalPrice, enumPedido);

        this.repository.saveLog(output);
    }

    public Map<LocalDate, Double> getMonthReport(int month) {
        List<String> logs = this.repository.getAll();
        Map<LocalDate, Double> result = new HashMap<>();

        for (String log : logs) {
            LocalDate lDate = this.extractDateFromLog(log);
            if (lDate.getMonth().getValue() == month) {
                result.put(lDate, this.extractPriceFromLog(log));
            }
        }

        return result;
    }

    public LocalDate getMostRantavelDay() {
        List<String> logs = this.repository.getAll();
        Map<String, Double> map = new HashMap<>();
        double currentMaxPrice = -1D;
        String dateReturn = "";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        for (String log : logs) {
            String dateStr = log.substring(0, 10);
            double price = Double.parseDouble(log.substring(log.indexOf('|') + 1));

            if (map.containsKey(dateStr)) {
                double previousPrice = map.get(dateStr);
                map.put(dateStr, previousPrice + price);
            } else {
                map.put(dateStr, price);
            }

            if (map.get(dateStr) > currentMaxPrice) {
                dateReturn = dateStr;
                currentMaxPrice = map.get(dateStr);
            }
        }

        return LocalDate.parse(dateReturn, formatter);
    }

    private Double getPrice(EnumPedido enumPedido, int quantidadePedido) {
        double price;
        switch (enumPedido) {
            case FILE -> price = 17 * quantidadePedido;
            case POLVO -> price = 34 * quantidadePedido;
            case MACARRONADA -> price = 12 * quantidadePedido;
            case COSTELA -> price = 25 * quantidadePedido;
            default -> price = 0;
        }

        return price;
    }

    private String buildOutputString(double totalPrice, EnumPedido enumPedido) {
        StringBuilder builder = new StringBuilder();
        LocalDate now = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        builder.append(now.format(formatter));
        builder.append(" ");
        builder.append(enumPedido.getValue()).append(" - ");
        builder.append(enumPedido).append(" ");
        builder.append(totalPrice);
        builder.append("\n");

        return builder.toString();
    }

    private LocalDate extractDateFromLog(String log) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dateStr = log.substring(0, 10);

        return LocalDate.parse(dateStr, formatter);
    }

    private double extractPriceFromLog(String log) {
        String priceStr = log.substring(log.indexOf("|") + 1);

        return Double.parseDouble(priceStr);
    }
}
