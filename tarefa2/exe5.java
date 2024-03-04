import java.util.Scanner;

public class SalarioVendedor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitação dos dados
        System.out.println("Digite o número de carros vendidos pelo vendedor:");
        int carrosVendidos = scanner.nextInt();

        System.out.println("Digite o valor total das vendas do vendedor:");
        double valorVendas = scanner.nextDouble();

        System.out.println("Digite o salário fixo do vendedor:");
        double salarioFixo = scanner.nextDouble();

        System.out.println("Digite o valor recebido por carro vendido pelo vendedor:");
        double valorPorCarro = scanner.nextDouble();

        // Calcula a comissão fixa por carro
        double comissaoPorCarro = carrosVendidos * valorPorCarro;

        // Calcula a comissão de 5% sobre as vendas
        double comissaoPorVendas = valorVendas * 0.05;

        // Calcula o salário final do vendedor
        double salarioFinal = salarioFixo + comissaoPorCarro + comissaoPorVendas;

        // Imprime o salário final do vendedor
        System.out.println("O salário final do vendedor é: R$" + salarioFinal);

        scanner.close();
    }
}
