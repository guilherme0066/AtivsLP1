import java.util.Scanner;

public class ResultadoEleicao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitação dos dados
        System.out.println("Digite o número total de eleitores:");
        int totalEleitores = scanner.nextInt();

        System.out.println("Digite o número de votos em branco:");
        int votosBranco = scanner.nextInt();

        System.out.println("Digite o número de votos nulos:");
        int votosNulos = scanner.nextInt();

        System.out.println("Digite o número de votos válidos:");
        int votosValidos = scanner.nextInt();

        // Calcula o percentual de cada tipo de voto
        double percentualBranco = (double) votosBranco / totalEleitores * 100;
        double percentualNulos = (double) votosNulos / totalEleitores * 100;
        double percentualValidos = (double) votosValidos / totalEleitores * 100;

        // Imprime os resultados
        System.out.println("Percentual de votos em branco: " + percentualBranco + "%");
        System.out.println("Percentual de votos nulos: " + percentualNulos + "%");
        System.out.println("Percentual de votos válidos: " + percentualValidos + "%");

        scanner.close();
    }
}
