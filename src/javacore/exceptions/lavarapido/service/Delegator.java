package javacore.exceptions.lavarapido.service;

import javacore.exceptions.lavarapido.exception.InvalidInputException;

public class Delegator {
    private FileService fileService;
    private LavaRapidoService lavaRapidoService;

    public Delegator(LavaRapidoService lavaRapidoService, FileService fs) {
        this.lavaRapidoService = lavaRapidoService;
        this.fileService = fs;
    }

    public void process(int option, int id) throws InvalidInputException {
        String idStr = String.valueOf(id);
        fileService.saveOnLogFile("Delegator", idStr);

        if (option < 1 || option > 3) {
            throw new InvalidInputException("Voce digitou uma opcao invalida, Possiveis valores: [1, 3]");
        }

        if (option == 1){
            fileService.saveOnLogFile("lavar", idStr);
            this.lavaRapidoService.lavar();
            return;
        }

        if (option == 2){
            fileService.saveOnLogFile("limparParaBrisa", idStr);
            this.lavaRapidoService.limparParaBrisa();
            return;
        }

        fileService.saveOnLogFile("alinharPneus", idStr);
        this.lavaRapidoService.alinharPneus();
    }
}
