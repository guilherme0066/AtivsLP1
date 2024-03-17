public class Animes {
    // Atributos
    private String nome;
    private int lancamento;
    private String distribuidora;

    // Construtor
    public Personagem(String nome, int lancamento, String distribuidora) {
        this.nome = nome;
        this.lancamento = lancamento;
        this.distribuidora = distribuidora;
    }

    // Métodos
    public String falar() {
        return "O anime se chama " + nome + "!";
    }

    public void complemento() {
        System.out.println(nome + " foi lancado em " + lancamento + ".");
    }

    public String fim() {
        return "O anime " + nome + ", lancado em " + idade + " foi distribuido por " + distribuidora + ".";
    }

}