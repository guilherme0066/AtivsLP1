public class TestaClasse {
    public static void main(String[] args) {
        // Criando objetos da classe Flores
        Jogos flor1 = new Jogo("Girassol", "Circulo", "amarelo");
        Jogos flor2 = new Jogo("Rosa", "Cone", "Vermelha");

        // Evocando métodos da classe Flores
        System.out.println(jogo1.conclusao());
        flor1.forma();

        System.out.println(jogo2.conclusao());
        flor2.forma();
    }
}