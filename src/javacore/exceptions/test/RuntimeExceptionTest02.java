package javacore.exceptions.test;

public class RuntimeExceptionTest02 {

    public static void main(String[] args) {
        // isso ira lancar excecao porque o divisor e zero

        try {

            System.out.println(divide(2, 0));
        } catch (RuntimeException e) {
            e.printStackTrace();
        }

        System.out.println("Finalizado");
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("B nao pode ser zero!");
        }

        return a / b;
    }
}
