import java.util.Scanner;

public class VerificaMaiorQueDez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitação do valor ao usuário
        System.out.println("Digite um valor:");

        // Leitura do valor
        int valor = scanner.nextInt();

        // Verifica se o valor é maior que 10 e imprime a mensagem correspondente
        if (valor > 10) {
            System.out.println("É MAIOR QUE 10!");
        } else {
            System.out.println("NÃO É MAIOR QUE 10!");
        }

        scanner.close();
    }
}
