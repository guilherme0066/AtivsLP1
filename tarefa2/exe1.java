import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitação da idade em anos, meses e dias
        System.out.println("Digite a idade em anos:");
        int anos = scanner.nextInt();
        System.out.println("Digite a idade em meses:");
        int meses = scanner.nextInt();
        System.out.println("Digite a idade em dias:");
        int dias = scanner.nextInt();

        // Calcula a idade em dias
        int idadeEmDias = anos * 365 + meses * 30 + dias;

        // Imprime a idade em dias
        System.out.println("A idade em dias é: " + idadeEmDias);

        scanner.close();
    }
}
