package javacore.orientacaoobjetos.classesabstratas.dominio;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public void calculaBonus() {
        System.out.println(0.05 * this.getSalario());
    }
}
