public class Desenhos {
    // Atributos
    private String nome;
    private int ano;
    private String produtora;

    // Construtor
    public Personagem(String nome, int ano, String produtora) {
        this.nome = nome;
        this.ano = ano;
        this.produtora = produtora;
    }

    // Métodos
    public String intro() {
        return "O desenho se chama " + nome + "!";
    }

    public void complemento() {
        System.out.println(nome + " foi produzido por" + produtora + ".");
    }

    public String fim() {
        return "O desenho " + nome + ", da produtora " + produtora + " foi lancado em " + ano + ".";
    }

}