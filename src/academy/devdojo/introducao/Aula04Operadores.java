package academy.devdojo.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {

        int numero1 = 10;
        int numero2 = 20;

        // divisao de dois inteiros sempre vai ser inteiro
        double divisao = numero1 / (double) numero2; // resultado vai ser zero

        // operador de resto -> %
        int resto = 20 % 3;
        System.out.println(resto);

        // < > <= >= == !=

        //Operadores de atribuicao
        // = += -= *= /= %=

        int bonus = 23;
        bonus %= 2;
        bonus -= 1;
        bonus += 1;
        bonus /= 10;
        bonus++;
        --bonus;
        ++bonus;
        bonus--;
        System.out.println(bonus);
    }

}
