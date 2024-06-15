public class Times {
    private int id;
    private String nome;
    private int titulos;
    private String alcunha;

    // Construtor
    public Times(int id, String nome, int titulos, String alcunha) {
        this.id = id;
        this.nome = nome;
        this.titulos = titulos;
        this.alcunha = alcunha;
    }

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public int getTitulos() { return titulos; }
    public void setTitulos(int titulos) { this.titulos = titulos; }
    public String getAlcunha() { return alcunha; }
    public void setAlcunha(String alcunha) { this.alcunha = alcunha; }

    // Métodos
    public String intro() {
        return "O time se chama " + nome + "!";
    }

    public void vulgo() {
        System.out.println(nome + " também conhecido como " + alcunha + ".");
    }

    public String conquistas() {
        return "A equipe " + nome + ", possui " + titulos + " títulos e o apelido de " + alcunha + ".";
    }
}
