import java.util.Scanner;

public class VerificaVotacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitação do ano atual e do ano de nascimento
        System.out.println("Digite o ano atual:");
        int anoAtual = scanner.nextInt();

        System.out.println("Digite o ano de nascimento:");
        int anoNascimento = scanner.nextInt();

        // Calcula a idade da pessoa
        int idade = anoAtual - anoNascimento;

        // Verifica se a pessoa pode votar este ano
        if (idade >= 16) {
            System.out.println("Você poderá votar este ano.");
        } else {
            System.out.println("Você não poderá votar este ano.");
        }

        scanner.close();
    }
}
