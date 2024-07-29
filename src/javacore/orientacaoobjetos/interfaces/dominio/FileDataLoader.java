package javacore.orientacaoobjetos.interfaces.dominio;

public class FileDataLoader implements DataLoader {
    @Override
    public void carregaDados() {
        System.out.println("Imprimindo dados do arquivo");
    }
}
