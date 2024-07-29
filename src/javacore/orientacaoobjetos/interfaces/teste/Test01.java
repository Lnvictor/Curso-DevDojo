package javacore.orientacaoobjetos.interfaces.teste;

import javacore.orientacaoobjetos.interfaces.dominio.DatabaseDataLoader;
import javacore.orientacaoobjetos.interfaces.dominio.FileDataLoader;

public class Test01 {
    public static void main(String[] args) {
        FileDataLoader fLoader = new FileDataLoader();
        fLoader.carregaDados();
        fLoader.checarPerimssao();

        DatabaseDataLoader dbLoader = new DatabaseDataLoader();
        dbLoader.carregaDados();
        dbLoader.checarPerimssao();
    }
}
