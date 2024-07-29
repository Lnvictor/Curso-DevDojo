package javacore.introducaoclasses.dominio;

public class Estudante {
    /*
    * para inserir valor default que nao seja null
    *
    * public String nome = "Zoro";
    * */
    public String nome;
    public int idade;
    public char sexo;

    // recebe um array de inteiros
    public void somaNumeros(int[] numeros){
        int soma = 0;

        for (int i : numeros){
            soma += i;
        }

        System.out.println(soma);
    }

    // varargs int... -> int[] é um array ou diversos numeros
    // nao pode ter mais nenhum atributo depois do VarArgs (Precisa ser o ultimo)
    public void somaNumeros2(int... numeros){
        int soma = 0;

        for (int i : numeros) {
            soma += i;
        }

        System.out.println(soma);
    }

    public static void main(String... args) {
        int[] nums = {1, 2, 3, 4, 5};
        Estudante t = new Estudante();

        t.somaNumeros2(nums);
        t.somaNumeros2(1, 2, 3, 4, 5);
    }
}
