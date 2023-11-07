import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //quilometragem inicial, quilometragem posto, quantidade de litros (ED)
        double kmInicial, kmFinal, qtdLitros, consumo;
        System.out.println("Informe quantos quilometros o marcador indicava no início da viagem: ");
        kmInicial = leitor.nextDouble();
        System.out.println("Informe quantos quilometros o marcador indicava na chegada ao posto: ");
        kmFinal = leitor.nextDouble();
        System.out.println("Informe quantos litros de combustível foram reabastecidos");
        qtdLitros = leitor.nextDouble();
        consumo = (kmFinal - kmInicial) / qtdLitros; //PD
        System.out.println("O consumo do veículo foi " + consumo + " k/l"); //SD
    }
}
