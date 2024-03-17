public class Carro {
    // Atributos
    private String nome;
    private int lancamento;
    private String marca;

    // Construtor
    public Personagem(String nome, int lancamento, String marca) {
        this.nome = nome;
        this.lancamento = lancamento;
        this.marca = marca;
    }

    // Métodos
    public String intro() {
        return "O carro é " + nome + "!";
    }

    public void complemento() {
        System.out.println(nome + " da marca " + marca + ".");
    }

    public String fim() {
        return "O carro " + nome + ", da marca " + marca + " foi lancado em: " + lancamento + ".";
    }

}