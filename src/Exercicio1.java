import java.util.Scanner;

public class Exercicio1 {
    //Constante
    static final double COTACAO = 4.87;
    public static void main(String[] args) {
        /*ONG recebe doações em dólares e precisa converter o valor para reais.
        * Criar um programa que permita ao usuário digitar o valor da doação (ED)
        * converter esse valor (PD) e exibir o valor em reais (SD).
        *
        * Variável => Um espaço na memória RAM para guardar uma informação
        * */

        Scanner leitor = new Scanner(System.in);
        double valorDolar, valorReais;
        System.out.println("Informe o valor da sua doação: $ ");
        valorDolar = leitor.nextDouble(); //Entrada
        valorReais = valorDolar * COTACAO; //Processamento
        //System.out.println("Sua doação em reais foi R$ " + valorReais); //Saída 487,00
        System.out.println("Sua doação em reais foi R$ " + String.format("%.2f",valorReais));
    }
}
