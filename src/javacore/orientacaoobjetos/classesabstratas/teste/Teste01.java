package javacore.orientacaoobjetos.classesabstratas.teste;

import javacore.orientacaoobjetos.classesabstratas.dominio.Desenvolvedor;
import javacore.orientacaoobjetos.classesabstratas.dominio.Gerente;

public class Teste01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Victor", 15000);
        Desenvolvedor dev = new Desenvolvedor("Will", 18000);

        gerente.calculaBonus();
        dev.calculaBonus();
    }
}
