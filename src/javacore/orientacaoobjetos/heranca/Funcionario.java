package javacore.orientacaoobjetos.heranca;

public class Funcionario extends Pessoa{
    private double salario;


    // se a classse pai tiver o construtor nao default, a assinatura no minimo deve ser a mesma
    public Funcionario(String name, int age, String cpf) {
        super(name, age, cpf);
        this.salario = salario;
    }

    public void imprime(){
        super.imprime();
        System.out.println("OPA TO DENTRO DA CLASSE FUNCIONARIO");
        System.out.println("TENTNADO PRINTAR ATRIBUTOS PRIVADOS");
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        Funcionario f = new Funcionario("Victor", 24, "adasdas");
        f.imprime();
    }
}
