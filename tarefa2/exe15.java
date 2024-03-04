import java.util.Scanner;

public class SalarioComHorasExtras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitação do número de horas trabalhadas no mês e do salário por hora
        System.out.println("Digite o número de horas trabalhadas no mês:");
        int horasTrabalhadasMes = scanner.nextInt();

        System.out.println("Digite o salário por hora:");
        double salarioPorHora = scanner.nextDouble();

        // Definição da jornada de trabalho semanal e semanas no mês
        int jornadaSemanal = 40;
        int semanasNoMes = 4;

        // Calcula as horas normais e as horas extras
        int horasNormais = jornadaSemanal * semanasNoMes;
        int horasExtras = Math.max(0, horasTrabalhadasMes - horasNormais);

        // Calcula o salário total, considerando as horas extras
        double salarioTotal = (horasNormais * salarioPorHora) + (horasExtras * salarioPorHora * 1.5);

        // Imprime o salário total do funcionário
        System.out.println("O salário total do funcionário é: R$" + salarioTotal);

        scanner.close();
    }
}
