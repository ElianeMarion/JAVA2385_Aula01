import java.util.Scanner;

public class Aula01 {
    public static void main(String[] args) {

        //Comentário de uma linha
        //Entrada x Saída x Processamento

        //Saída => o programa precisar exibir informações para o usuário (eclipse => syso | intelliJ => sout)
        System.out.println("Boa noite!");
        System.out.println("Sejam bem vindos");


        //camelCase | Snack_case
        //nomeDoAluno    nome_do_aluno
        //Variável de memória: tipo nomeVariavel;
        int idade;
        byte idadeDoAluno;
        char letra;
        String nome;


        //Entrada de dados => Usuário precisar interagir com o sistema
        Scanner entrada = new Scanner(System.in);
        /*System.out.println("Digite seu nome: ");
        nome = entrada.next();
        System.out.println("Por favor digite sua idade: ");
        idade = entrada.nextInt();
        System.out.println(nome + " sua idade é " + idade + " anos");*/
        //entrada.nextDouble();   => leitura de um double
        //entrada.next();         => leitura de um texto


        //Processamento => atribuição / cálculos
        int x = 10;


        //Operadores aritméticos
        /*
        1 - Divisão /  (divisão inteira, divisão com casas decimais
        1 - Multiplicação *
        1 - Resto da divisão %
        2 - Soma +
        2 - Subtração -
        ()
        * */

        int divisao = 5 / 2;
        System.out.println("Resultado = " + divisao);

        double resultado = 5.0 / 2;
        System.out.println("Resultado = " + resultado);

        int resto = 5 % 2;
        System.out.println("Resultado = " + resto);

        x = 20;

        x += 3; // igual x = x + 3;
        // += -= *= /=
        // ++ --
        x++; //somando 1 no x


        /*Comentário de
        várias  linhas
        * */

    }

}
