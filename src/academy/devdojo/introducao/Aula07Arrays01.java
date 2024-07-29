package academy.devdojo.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        int[] idades = new int[5];

        // isso nao pode acontecer pois somente objetos podem receber null, por que sao referencias
        //int idade = null;

        idades[0] = 19;

        // valores default inicializacao arrays
        // int, short, byte, float... = o
        // char '\u0000' -> ''
        //boolean -> false
        //String -> null


        String[] nomes = new String[3];
        nomes[0] = "Goku";
        nomes[1] = "Maria";
        nomes[2] = "Luffy";

        nomes = new String[5];

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
