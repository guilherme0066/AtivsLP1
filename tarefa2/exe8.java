import java.util.Scanner;

public class VerificaPositivoNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitação do valor ao usuário
        System.out.println("Digite um valor:");

        // Leitura do valor
        int valor = scanner.nextInt();

        // Verifica se o valor é positivo ou negativo
        if (valor >= 0) {
            System.out.println("O valor é positivo.");
        } else {
            System.out.println("O valor é negativo.");
        }

        scanner.close();
    }
}
