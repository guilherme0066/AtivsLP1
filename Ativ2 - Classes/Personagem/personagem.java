public class Personagem {
    // Atributos
    private String nome;
    private int idade;
    private String profissao;

    // Construtor
    public Personagem(String nome, int idade, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
    }

    // Métodos
    public String falar() {
        return "Olá, meu nome é " + nome + "!";
    }

    public void trabalhar() {
        System.out.println(nome + " está trabalhando como " + profissao + ".");
    }

    public String seApresentar() {
        return "Meu nome é " + nome + ", tenho " + idade + " anos e sou " + profissao + ".";
    }

}