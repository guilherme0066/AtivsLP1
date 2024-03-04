import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitação da temperatura em Fahrenheit
        System.out.println("Digite a temperatura em graus Fahrenheit:");
        double fahrenheit = scanner.nextDouble();

        // Calcula a temperatura em Celsius
        double celsius = (5.0 / 9.0) * (fahrenheit - 32);

        // Imprime o valor correspondente em Celsius
        System.out.println("A temperatura em graus Celsius é: " + celsius);

        scanner.close();
    }
}
