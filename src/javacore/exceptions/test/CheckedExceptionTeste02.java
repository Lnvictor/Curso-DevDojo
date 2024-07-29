package javacore.exceptions.test;

public class CheckedExceptionTeste02 {

    public static void main(String[] args) {
        String palavra = "Palavrao";

        try{
            System.out.println(dizAlgumaCoisa(palavra));
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }

    // Quando se lanca uma excecao checked, tem que colocar o throws no metodo
    public static String dizAlgumaCoisa(String palavra) throws Exception {
        if (palavra.equals("Palavrao")) {
            throw new Exception("Nao pode falar palavrao");
        }

        return palavra;
    }
}
