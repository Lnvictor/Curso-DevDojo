package javacore.fut.dominio;

import javacore.fut.enums.EnumStrongFeet;

public abstract class Jogador {
    private String nome;
    private int idade;
    private String time;
    private EnumStrongFeet peBom;

    public Jogador(String nome, int idade, String time, EnumStrongFeet peBom) {
        this.nome = nome;
        this.idade = idade;
        this.time = time;
        this.peBom = peBom;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public EnumStrongFeet getPeBom() {
        return peBom;
    }

    public void setPeBom(EnumStrongFeet peBom) {
        this.peBom = peBom;
    }

    public void imprime() {
        System.out.println(String.format("Nome: %s", this.nome));
    }
}
