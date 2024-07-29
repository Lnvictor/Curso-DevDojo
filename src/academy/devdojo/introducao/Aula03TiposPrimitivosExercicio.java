package academy.devdojo.introducao;

/**
 * Pratica
 * <p>
 * Crie variaveis para os campos descritos abaixo entre <>
 * e imprima a seguinte mensagem:
 * <p>
 * Eu <nome>, morando no endereco <endereco>, confirmo que
 * recebi o salario de <salario>, na data <data>
 */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Victor";
        String endereco = "Rua dos inteligentes, numero 0";
        double salario = 10000;
        String data = "28/05/2024";

        System.out.printf("Eu %s morando no endereço %s confirmo que recebi o salario: R$%s na data %s", nome, endereco, salario, data);
    }
}
