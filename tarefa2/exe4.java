import java.util.Scanner;

public class CustoCarro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitação do custo de fábrica do carro
        System.out.println("Digite o custo de fábrica do carro:");
        double custoFabrica = scanner.nextDouble();

        // Percentual do distribuidor e dos impostos
        double percentualDistribuidor = 0.28;
        double percentualImpostos = 0.45;

        // Calcula o custo final ao consumidor
        double custoDistribuidor = custoFabrica * percentualDistribuidor;
        double custoImpostos = custoFabrica * percentualImpostos;
        double custoFinal = custoFabrica + custoDistribuidor + custoImpostos;

        // Imprime o custo final ao consumidor
        System.out.println("O custo final do carro ao consumidor é: R$" + custoFinal);

        scanner.close();
    }
}
