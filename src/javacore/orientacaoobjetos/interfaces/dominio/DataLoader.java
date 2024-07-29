package javacore.orientacaoobjetos.interfaces.dominio;

public interface DataLoader {
    // todos atributos de interface sao constantes no java (static final)
    int MAX_SIZE = 10;


    // o public abstract void é redundante em interfaces, todos os metodos sao assim
    public abstract void carregaDados();

    //void carregaDados -> poderia ser assim tambem


    // Podemos implementar o metodo na interface utilizando o modificador default
    default void checarPerimssao(){
        System.out.println("Checando permissao generico");
    }

    // nao pode ser sobrescrita
    public static void imprimirStatic(){
        System.out.println("alou alou");
    }
}
