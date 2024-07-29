package javacore.orientacaoobjetos.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    // o estatico e executado quando a classe e carregada
    static {
        System.out.println("Dentro do bloco de inicializacao estatico");
        Anime.episodios = new int[5];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    {
        System.out.println("Dentro do bloco de inicializacao");
    }

    public Anime(String nome) {
        this.nome = nome;

        for (int episodio : Anime.episodios) {
            System.out.println(episodio);
        }
    }

    public static void main(String[] args) {
        Anime a1 = new Anime("alo");
        Anime a2 = new Anime("alo");
        Anime a3 = new Anime("alo");
    }
}
