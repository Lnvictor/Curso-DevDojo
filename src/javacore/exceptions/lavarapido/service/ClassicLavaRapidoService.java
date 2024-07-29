package javacore.exceptions.lavarapido.service;

public class ClassicLavaRapidoService implements LavaRapidoService {
    @Override
    public void lavar() {
        System.out.println("Aqui é raiz, lava o carro com sabao de pedra!!");
    }

    @Override
    public void limparParaBrisa() {
        System.out.println("Aqui é raiz, lava o para brisa com sabao de pedra!!!");
    }

    @Override
    public void alinharPneus() {
        System.out.println("Nois é raiz, anda com o pneu alinhadao!!!!!");
    }
}
