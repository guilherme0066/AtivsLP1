public class TestaClasse {
    public static void main(String[] args) {
        // Criando objetos da classe Celulares
        Personagem celular2 = new Personagem("Iphone 15", 2023, "Apple");
        Personagem celular2 = new Personagem("S24", 2024, "Samsung");

        // Evocando métodos da classe Celulares
        System.out.println(celular1.fim());
        celular1.complemento();

        System.out.println(celular2.fim());
        celular2.complemento();
    }
}