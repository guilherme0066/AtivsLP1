import java.util.Scanner;

public class DuracaoJogoXadrez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitação da hora de início e da hora de fim do jogo
        System.out.println("Digite a hora de início do jogo:");
        int horaInicio = scanner.nextInt();

        System.out.println("Digite a hora de fim do jogo:");
        int horaFim = scanner.nextInt();

        // Calcula a duração do jogo
        int duracaoJogo;

        if (horaFim > horaInicio) {
            duracaoJogo = horaFim - horaInicio;
        } else {
            duracaoJogo = 24 - horaInicio + horaFim;
        }

        // Imprime a duração do jogo
        System.out.println("A duração do jogo é de " + duracaoJogo + " horas.");

        scanner.close();
    }
}
