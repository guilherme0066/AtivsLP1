public class TestaClasse {
    public static void main(String[] args) {
        // Criando objetos da classe Times
        Times time1 = new Time("Liverpool", 19, "Reds");
        Times time2 = new Time("Dortmund", 22, "BVB");

        // Evocando métodos da classe Times
        System.out.println(time1.conquistas());
        time1.vulgo();

        System.out.println(time2.conquistas());
        time2.vulgo();
    }
}