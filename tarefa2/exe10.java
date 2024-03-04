import java.util.Scanner;

public class VerificaAprovacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitação das notas das avaliações
        System.out.println("Digite a nota da 1ª avaliação:");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a nota da 2ª avaliação:");
        double nota2 = scanner.nextDouble();

        // Calcula a média aritmética simples
        double media = (nota1 + nota2) / 2;

        // Verifica se o aluno foi aprovado ou não
        if (media >= 6) {
            System.out.println("Parabéns! Você foi aprovado.");
        } else {
            System.out.println("Você não foi aprovado.");
        }

        // Imprime a média calculada
        System.out.println("A média é: " + media);

        scanner.close();
    }
}
