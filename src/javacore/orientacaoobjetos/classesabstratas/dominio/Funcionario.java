package javacore.orientacaoobjetos.classesabstratas.dominio;

public abstract class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public abstract void calculaBonus();

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

//    public void calculaBonus(){
//        System.out.println(0.1 * this.salario);
//    }
}
