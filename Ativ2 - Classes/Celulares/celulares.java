public class Celulares {
    // Atributos
    private String modelo;
    private int lancamento;
    private String marca;

    // Construtor
    public Celulares(String modelo, int lancamento, String marca) {
        this.modelo = modelo;
        this.lancamento = lancamento;
        this.marca = marca;
    }

    // Métodos
    public String intro() {
        return "O celular " + modelo + "!";
    }

    public void complemento() {
        System.out.println(modelo + " da marca " + marca + ".");
    }

    public String fim() {
        return "O celular " + modelo + ", da marca " + marca + " foi lancado em " + lancamento + ".";
    }

}