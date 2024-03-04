import java.util.Scanner;

public class ReajusteSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitação do salário atual e do percentual de reajuste
        System.out.println("Digite o salário mensal atual do funcionário:");
        double salarioAtual = scanner.nextDouble();

        System.out.println("Digite o percentual de reajuste (em %):");
        double percentualReajuste = scanner.nextDouble();

        // Calcula o valor do reajuste
        double valorReajuste = salarioAtual * (percentualReajuste / 100);

        // Calcula o novo salário
        double novoSalario = salarioAtual + valorReajuste;

        // Imprime o valor do novo salário
        System.out.println("O novo salário do funcionário é: R$" + novoSalario);

        scanner.close();
    }
}
