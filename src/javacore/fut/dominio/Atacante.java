package javacore.fut.dominio;

import javacore.fut.enums.EnumStrongFeet;

public class Atacante extends Jogador {
    private int finalizacao;
    private int drible;
    private int amplitude;

    public Atacante(String nome, int idade, String time, EnumStrongFeet peBom, int finalizacao,
                    int drible, int amplitude) {
        super(nome, idade, time, peBom);
        this.finalizacao = finalizacao;
        this.drible = drible;
        this.amplitude = amplitude;
    }

    @Override
    public void imprime() {
        System.out.println(
                String.format(
                            """
                            Nome: %s
                            Posição: Atacante
                            Time: %s
                            Finalizacao: %s
                            Drible: %s
                            Amplitude: %s
                            """,
                            this.getNome(), this.getTime(), this.finalizacao, this.drible, this.amplitude
                )
        );
    }

    public void gritaGol(){
        System.out.println("OLHUGOOOOOOOOL");
    }
}
