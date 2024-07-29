package academy.devdojo.introducao;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        // convencao -> camelCase (Para variaveis)
        int idade = 10;
        long numeroGrande = 100000000;
        double peso = 78.8;
        double salarioDouble = 2000;
        float salarioFloat = 2500;
        byte idadeByte = -128; // [-128, 127]
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 3358;

        // para especificar que é float
        // (senao colocar ele considera double e da erro de compilacao
        float f = 2000.0f;

        //long
        long lon = 1000L;

        // casting (ele vai cortar bit porque o numero nao vai caber)
        int idade2 = (int) 1000000000000000L;

        // Nesse caso ele vai pegar so a parte inteira
        int idade3 = (int) 123.2;

        // Strings -> Nao e um tipo primitivo
        String nome = "Goku";

        System.out.println("Oi, meu nome é " + nome);
        System.out.println("A idade e " + idade);
        System.out.println(String.format("A idade e %s anos", idade));
        System.out.println(false);
        System.out.println(caractere);
    }
}
