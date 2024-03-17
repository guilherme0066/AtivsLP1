public class TestaClasse {
    public static void main(String[] args) {
        // Criando objetos da classe Jogos
        Jogos jogo1 = new Jogo("Infamous", 2009, "PS3");
        Jogos jogo2 = new Jogo("Halo: Reach", 2010, "Xbox360");

        // Evocando métodos da classe Jogos
        System.out.println(jogo1.plataforma());
        jogo1.lancado();

        System.out.println(jogo2.plataforma());
        jogo2.lancado();
    }
}