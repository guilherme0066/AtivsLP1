public class Jogos {
    // Atributos
    private String nome;
    private int lancamento;
    private String plataforma;

    // Construtor
    public Times(String nome, int lancamento, String plataforma) {
        this.nome = nome;
        this.lancamento = lancamento;
        this.plataforma = plataforma;
    }

    // Métodos
    public String intro() {
        return "O jogo se chama " + nome + "!";
    }

    public void lancado() {
        System.out.println(nome + " foi lancado em " + lancamento + ".");
    }

    public String plataforma() {
        return "A jogo" + nome + ", lancado em " + lancamento + " nas plataformas " + plataforma + ".";
    }

}