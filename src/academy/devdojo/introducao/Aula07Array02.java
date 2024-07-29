package academy.devdojo.introducao;

public class Aula07Array02 {
    public static void main(String[] args) {
        // inicialização com atribuicao

        int[] numeros2 = {1, 2, 3, 4, 5};
        int[] numeros3 = new int[]{1, 2, 3, 4, 5};

        for(int num : numeros3){
            System.out.println(num);
        }
    }
}
