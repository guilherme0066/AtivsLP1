public class TestaClasse {
    public static void main(String[] args) {
        // Criando objetos da classe Carro
        Carro carro1 = new Carro("RX7", 1978, "Mazda");
        Carro carro2 = new Carro("Vectra", 1988, "Chevrolet");

        // Evocando métodos da classe Carro
        System.out.println(carro1.fim());
        carro1.complemento();

        System.out.println(carro2.fim());
        carro2.complemento();
    }
}