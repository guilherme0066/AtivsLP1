public class Animais {
    // Atributos
    private String nome;
    private int vida;
    private String familia;

    // Construtor
    public Personagem(String nome, int vida, String familia) {
        this.nome = nome;
        this.vida = vida;
        this.familia = familia;
    }

    // Métodos
    public String falar() {
        return "O animal se chama " + nome + "!";
    }

    public void complemento() {
        System.out.println(nome + " é da familia " + familia + ".");
    }

    public String fim() {
        return "O animal " + nome + ", da familia " + familia + " tem expectativa de vida de " + vida + " anos.";
    }

}