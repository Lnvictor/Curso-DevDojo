package javacore.orientacaoobjetos.classesabstratas.dominio;

public class Gerente extends Funcionario{
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calculaBonus() {
        System.out.println(0.01 * this.getSalario());
    }
}
