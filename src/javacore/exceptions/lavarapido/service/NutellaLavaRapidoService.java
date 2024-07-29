package javacore.exceptions.lavarapido.service;

public class NutellaLavaRapidoService implements LavaRapidoService {
    @Override
    public void lavar() {
        System.out.println("Aqui e nutellinha usa produtinho especial pra lavar o carro");
    }

    @Override
    public void limparParaBrisa() {
        System.out.println("Aqui e nutellinha usa produtinho especial pra lavar o parabrisa");
    }

    @Override
    public void alinharPneus() {
        System.out.println("Aiiin leva no borracheiro");
    }
}
