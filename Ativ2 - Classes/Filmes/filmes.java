public class Filmes {
    // Atributos
    private String nome;
    private int lancamento;
    private String distribuidora;

    // Construtor
    public Filmes(String nome, int lancamento, String distribuidora) {
        this.nome = nome;
        this.lancamento = lancamento;
        this.distribuidora = distribuidora;
    }

    // Métodos
    public String intro() {
        return "O filme se chama " + nome + "!";
    }

    public void complemento() {
        System.out.println(nome + " foi lancado em " + lancamento + ".");
    }

    public String fim() {
        return "O filme " + nome + ", lancado em " + lancamento + " foi distribuido por " + distribuidora + ".";
    }

}