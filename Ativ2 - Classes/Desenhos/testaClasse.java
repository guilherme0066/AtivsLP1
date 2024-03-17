public class TestaClasse {
    public static void main(String[] args) {
        // Criando objetos da classe Desenhos
        Desenhos desenho1 = new Desenhos("Ben10", 2005, "Cartoon Network");
        Desenhos desenho2 = new Desenhos("Pica Pau", 1950, "Universal");

        // Evocando métodos da classe Desenhos
        System.out.println(desenho1.fim());
        desenho1.complemento();

        System.out.println(desenho2.fim());
        desenho2.complemento();
    }
}