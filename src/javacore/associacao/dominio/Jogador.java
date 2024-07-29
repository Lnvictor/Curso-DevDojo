package javacore.associacao.dominio;

public class Jogador {
    private String nome;
    private Time time;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public Jogador(String nome, Time time) {
        this(nome);
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void imprime(){
        System.out.printf("Nome: %s ", this.nome);

        if (this.time != null){
            System.out.printf("Time: %s\n", this.time.getNome());
        }
        else{
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Time time = new Time("Seleção Brasileira");

        Jogador jogador1 = new Jogador("Pelé", time);
        Jogador jogador2 = new Jogador("Romário", time);
        Jogador jogador3 = new Jogador("Cafu");

        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }

    }
}
