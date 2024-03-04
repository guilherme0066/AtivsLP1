import java.util.Scanner;

public class CustoTotalMacas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitação do número de maçãs compradas
        System.out.println("Digite o número de maçãs compradas:");

        // Leitura do número de maçãs
        int numeroMacas = scanner.nextInt();

        // Cálculo do custo total da compra
        double custoTotal;

        if (numeroMacas < 12) {
            custoTotal = numeroMacas * 1.30;
        } else {
            custoTotal = numeroMacas * 1.00;
        }

        // Imprime o custo total da compra
        System.out.println("O custo total da compra é: R$" + custoTotal);

        scanner.close();
    }
}
