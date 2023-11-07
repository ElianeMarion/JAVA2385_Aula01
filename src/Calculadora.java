import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        //Leitura de 2 valores e fazer as operações aritméticas

        Scanner leitor = new Scanner(System.in);
        //Leitura - Entrada de dados
        int valor1, valor2;
        System.out.println("Calculadora\n\nDigite um valor: ");
        valor1 = leitor.nextInt();

        System.out.println("Digite o segundo valor: ");
        valor2 = leitor.nextInt();

        int soma, subtracao, multiplicacao;
        double divisao;
        soma = valor1 + valor2;
        System.out.println("A soma dos dois valores é " + soma);
        subtracao = valor1 - valor2;
        System.out.println("A subtração dos dois valores é " + subtracao);
        multiplicacao = valor1 * valor2;
        System.out.println("A multiplicação dos dois valores é " + multiplicacao);
        divisao = valor1 / (double) valor2;
        System.out.println("A divisão dos dois valores é " + divisao);

        System.out.println(valor1 + " + " + valor2 + " = " + soma);


    }
}
