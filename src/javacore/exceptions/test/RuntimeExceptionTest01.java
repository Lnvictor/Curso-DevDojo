package javacore.exceptions.test;

public class RuntimeExceptionTest01 {

    public static void main(String[] args) {
        Object meuObjetoNulo = null;

        //isso vai lancar uma Runtime Excetpino nullpointer
        meuObjetoNulo.toString();
    }
}
