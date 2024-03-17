public class TestaClasse {
    public static void main(String[] args) {
        // Criando objetos da classe Animes
        Animes anime1 = new Animes("Naruto", 2002, "Tv Tokyo");
        Animes anime2 = new Animes("Pokemon", 1997, "Tv Tokyo");

        // Evocando métodos da classe Animes
        System.out.println(anime1.fim());
        anime1.complemento();

        System.out.println(anime2.fim());
        anime2.complemento();
    }
}