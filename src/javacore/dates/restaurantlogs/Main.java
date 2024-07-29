package javacore.dates.restaurantlogs;

import javacore.dates.restaurantlogs.exceptions.InvalidPedidoException;
import javacore.dates.restaurantlogs.repositories.TextRepository;
import javacore.dates.restaurantlogs.repositories.TextRepositoryImpl;
import javacore.dates.restaurantlogs.services.RestauranteService;

import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Numero do pedido: \n");
//        int pedido = scanner.nextInt();
//
//        System.out.println("Quantidade do pedido: \n");
//        int quantidade = scanner.nextInt();
//
        TextRepository repository = new TextRepositoryImpl();
        RestauranteService service = new RestauranteService(repository);
//        try {
//            service.registerPedido(pedido, quantidade);
//        } catch (InvalidPedidoException e) {
//            e.printStackTrace();
//        }

        //para efeitos de teste

//        LocalDate date = service.getMostRantavelDay();
//        System.out.println(date);

        for (Map.Entry<LocalDate, Double> entry : service.getMonthReport(7).entrySet()){
            System.out.println(String.format("%s -> R$ %s", entry.getKey(), entry.getValue()));
        }
    }
}
