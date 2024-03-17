public class TestaClasse {
    public static void main(String[] args) {
        // Criando objetos da classe Animais
        Animais animal1 = new Animais("Bode", 16, "Bovídeos");
        Animais animal2 = new Animais("Pequines", 13, "Cachorro miniatura");

        // Evocando métodos da classe Animais
        System.out.println(animal1.fim());
        animal1.complemento();

        System.out.println(animal2.fim());
        animal2.complemento();
    }
}