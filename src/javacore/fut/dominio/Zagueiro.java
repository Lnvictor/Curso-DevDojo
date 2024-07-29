package javacore.fut.dominio;

import javacore.fut.enums.EnumStrongFeet;

public class Zagueiro extends Jogador {
    private int bote;
    private int resistencia;
    private int impulsao;


    public Zagueiro(String nome, int idade, String time, EnumStrongFeet peBom, int bote, int resistencia, int impulsao) {
        super(nome, idade, time, peBom);

        this.bote = bote;
        this.resistencia = resistencia;
        this.impulsao = impulsao;
    }

    public void imprime() {
        System.out.println(
                String.format(
                                """
                                Nome: %s
                                Posição: Zagueiro
                                Time: %s
                                Bote: %s
                                Resistencia: %s
                                Impulsao: %s
                                """,
                        this.getNome(), this.getTime(), this.bote, this.resistencia, this.impulsao
                )
        );
    }

    public void tiraAZaga(){
        System.out.println("Afaaaasta a zaga");
    }
}
