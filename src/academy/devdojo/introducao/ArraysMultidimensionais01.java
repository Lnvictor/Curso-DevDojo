package academy.devdojo.introducao;

public class ArraysMultidimensionais01 {
    public static void main(String[] args) {
        int[][] dias = new int[12][];

        //inicializacao
        int[][] matrixInt = new int[3][];
        matrixInt[0] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        matrixInt[1] = new int[]{1, 2};
        matrixInt[2] = new int[]{};

        int[][] matrixInt2 = {{1, 2, 3},{1},{2, 6}};

        for (int[] array : matrixInt){
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            for (int num : array){
                System.out.println(num);
            }
        }

        for (int i = 0; i < dias.length; i++) {
            dias[i] = new int[31];

            for (int dia : dias[i]){
                System.out.println(String.format("mes -> %s | dia -%s", i, dia));
            }
        }
    }
}
