package javacore.orientacaoobjetos.enums.dominio;

public class Pessoa {
    private String nome;
    private int age;
    private TipoPessoa tipo;

    public Pessoa(String nome, int age, TipoPessoa tipo){
        this.nome = nome;
        this.age = age;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", age=" + age +
                ", tipo=" + tipo +
                '}';
    }

    public static void main(String[] args) {
        Pessoa p = new Pessoa("Victor", 24, TipoPessoa.PESSOA_FISICA);
        System.out.println(p);
        TipoPessoa tp = TipoPessoa.getByTipoRelatorio("Pessoa fisica");
        System.out.println(tp);
    }
}
