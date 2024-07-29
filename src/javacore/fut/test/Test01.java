package javacore.fut.test;

import javacore.fut.dominio.Atacante;
import javacore.fut.dominio.Jogador;
import javacore.fut.dominio.Zagueiro;
import javacore.fut.enums.EnumStrongFeet;

public class Test01 {
    public static void main(String[] args) {
        Jogador jogador = new Atacante("Vini JR", 23, "Real Madrid", EnumStrongFeet.DIREITA,
                78, 95, 90);

        jogador.imprime();

        Jogador jogador2 = new Zagueiro("Van Dijk", 29, "Liverpool", EnumStrongFeet.DIREITA,
                100, 95, 90);

        jogador2.imprime();


        // instanceof checa o tipo da instancia, util quando for explicit cast

        if (jogador instanceof Atacante){
            Atacante atacante = (Atacante) jogador;
            atacante.gritaGol();
        }

        if (jogador2 instanceof Zagueiro){
            Zagueiro zagueiro = (Zagueiro) jogador2;
            zagueiro.tiraAZaga();
        }
    }
}
