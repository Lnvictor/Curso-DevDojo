package javacore.orientacaoobjetos.dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    public static double velocidadeLimite = 250;

    public void imprime(){
        System.out.printf(nome, velocidadeMaxima, Carro.velocidadeLimite);
    }

    public static void imprimeEstatico(){
        // metodos estaticos só podem acessar escopo estatico
        System.out.printf(String.valueOf(Carro.velocidadeLimite));
    }
}
