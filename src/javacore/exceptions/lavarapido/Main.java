package javacore.exceptions.lavarapido;

import javacore.exceptions.lavarapido.exception.InvalidInputException;
import javacore.exceptions.lavarapido.exception.InvalidRandomId;
import javacore.exceptions.lavarapido.service.*;

import java.lang.reflect.InvocationTargetException;
import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Main {
    private static Scanner scanner;

    public static Scanner getScannerInstance() {
        if (Main.scanner == null) {
            Main.scanner = new Scanner(System.in);
        }

        return Main.scanner;
    }

    public static int lavaRapidoMenu() {
        System.out.println(
                """
                        Escolha um lava rapido para ir
                                                
                        1. Lava Rapido Raiz
                        2. Lava Rapido Nutella          
                        """
        );

        int option = scanner.nextInt();

        if (option < 1 || option > 2) {
            throw new InvalidInputException("Selecione um valor valido para tipo de lava rapido!!");
        }
        return option;
    }

    public static int serviceMenu(){
        System.out.println(
                """
                                Menu
                                       
                                1. Lavar carro:
                                2. Limpar parabrisa:
                                3. Alinhar pneus:
                                                
                                Ecollha uma opcao
                                                
                        """
        );

        return scanner.nextInt();
    }

    public static void main(String[] args) throws InvalidRandomId, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        getScannerInstance();
        LavaRapidoService service;
        Class[] classes = new Class[]{ClassicLavaRapidoService.class, NutellaLavaRapidoService.class};

        int lavaRapidoOption = lavaRapidoMenu();
        Delegator delegator = new Delegator(
                (LavaRapidoService) classes[lavaRapidoOption - 1].getDeclaredConstructor().newInstance(),
                new FileService());

        int serviceOption = serviceMenu();
        try {
            int id = Random.from(RandomGenerator.getDefault()).nextInt();

            if (id < 0){
                // inseri isso aqui so pra estudar sobre checked exceptions...
                throw new InvalidRandomId("O Id nao pode ser menor que zero!!!!");
            }

            delegator.process(serviceOption, id);
        } catch (InvalidInputException ex) {
            ex.printStackTrace();
        }
    }
}
