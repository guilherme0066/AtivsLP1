public class Flores {
    // Atributos
    private String especie;
    private String formato;
    private String cor;

    // Construtor
    public Times(String especie, String formato, String cor) {
        this.especie = especie;
        this.formato = formato;
        this.cor = cor;
    }

    // Métodos
    public String intro() {
        return "A flor se chama " + especie + "!";
    }

    public void forma() {
        System.out.println(especie + " possui o formato de " + formato + ".");
    }

    public String conclusao() {
        return "A flor" + especie + ", possui o formato de " + formato + " e tem a cor " + cor + ".";
    }

}