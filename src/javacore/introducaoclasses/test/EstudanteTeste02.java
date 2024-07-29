package javacore.introducaoclasses.test;

import javacore.introducaoclasses.dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante.nome = "Zoro";
        estudante2.nome = "Sanji";

        estudante.idade = 25;
        estudante2.idade = 30;

        System.out.println(estudante.nome);
        System.out.println(estudante2.nome);
    }
}
