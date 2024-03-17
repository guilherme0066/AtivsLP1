public class TestaClasse {
    public static void main(String[] args) {
        // Criando objetos da classe Personagem
        Personagem personagem1 = new Personagem("Alice", 30, "Engenheira");
        Personagem personagem2 = new Personagem("Bob", 25, "Médico");

        // Evocando métodos da classe Personagem
        System.out.println(personagem1.seApresentar());
        personagem1.trabalhar();

        System.out.println(personagem2.seApresentar());
        personagem2.trabalhar();
    }
}