public class Times {
    // Atributos
    private String nome;
    private int titulos;
    private String alcunha;

    // Construtor
    public Times(String nome, int titulos, String alcunha) {
        this.nome = nome;
        this.titulos = titulos;
        this.alcunha = alcunha;
    }

    // Métodos
    public String intro() {
        return "O time se chama " + nome + "!";
    }

    public void vulgo() {
        System.out.println(nome + " tambem conhecido como " + alcunha + ".");
    }

    public String conquistas() {
        return "A equipe" + nome + ", possui " + titulos + " titulos e a o apelido de " + alcunha + ".";
    }

}