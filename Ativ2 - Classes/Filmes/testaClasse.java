public class TestaClasse {
    public static void main(String[] args) {
        // Criando objetos da classe Filmes
        Filmes filme1 = new Filmes("Transformers", 2007, "Paramount");
        Filmes filme2 = new Filmes("Duna", 2021, "WarnerBros");

        // Evocando métodos da classe Filmes
        System.out.println(filme1.fim());
        filme1.complemento();

        System.out.println(filme2.fim());
        filme2.complemento();
    }
}