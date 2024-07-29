package javacore.orientacaoobjetos.interfaces.dominio;

public class DatabaseDataLoader implements DataLoader{
    @Override
    public void carregaDados() {
        System.out.println("Imprimindo dados pelo banco de dados");
    }
}
