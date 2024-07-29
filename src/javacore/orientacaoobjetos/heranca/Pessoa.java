package javacore.orientacaoobjetos.heranca;

public class Pessoa {
    protected String name; // protected => todos no mesmo pacote podem acessar diretamente
    private int age;
    private String cpf;

    public Pessoa(String name, int age, String cpf) {
        this.name = name;
        this.age = age;
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void imprime(){
        System.out.println("OPA TO DENTRO DA CLASSE PESSOA");
    }

    public static void main(String[] args) {
        Funcionario f = new Funcionario("", 1, "");
        //System.out.println(f.salario); -> nao funciona pq eh privado
    }
}
