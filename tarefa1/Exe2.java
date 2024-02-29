import java.util.Scanner;

public class MediaLP1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitação das notas ao usuário
        System.out.println("Digite as notas de LP1 do aluno (separadas por espaço):");
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();

        // Cálculo da média
        double media = (nota1 + nota2 + nota3) / 3;

        // Imprime a média
        System.out.println("A média de LP1 do aluno é: " + media);

        scanner.close();
    }
}