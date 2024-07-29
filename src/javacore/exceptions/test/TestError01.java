package javacore.exceptions.test;

public class TestError01 {
    public static void main(String[] args) {
        recursividade();
    }

    // Isso vai lençar uma exceção, StackOverflow
    // Error é quando nao tem mais como arrumar o problema, exemplo: StackOverflow Error
    public static void recursividade(){
        recursividade();
    }
}
