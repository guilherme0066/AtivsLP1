public class GastosTrimestre {
    public static void main(String[] args) {
        // Gastos de cada mês
        int janeiro = 15000;
        int fevereiro = 23000;
        int marco = 17000;

        // Calculando a despesa total no trimestre
        int despesaTotal = janeiro + fevereiro + marco;

        // Calculando a média mensal de gastos
        double mediaMensal = (double) despesaTotal / 3;

        // Imprimindo os resultados
        System.out.println("Despesa total no trimestre: R$" + despesaTotal);
        System.out.println("Média mensal de gastos: R$" + mediaMensal);
    }
}