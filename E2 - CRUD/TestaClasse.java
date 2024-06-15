import java.sql.SQLException;
import java.util.List;

public class TestaClasse {
    public static void main(String[] args) {
        TimesDAO timesDAO = new TimesDAO();

        // Inserir times
        Times time1 = new Times(0, "Liverpool", 19, "Reds");
        Times time2 = new Times(0, "Dortmund", 22, "BVB");

        try {
            timesDAO.insertTime(time1);
            timesDAO.insertTime(time2);

            // Listar todos os times
            List<Times> times = timesDAO.selectAllTimes();
            for (Times time : times) {
                System.out.println(time.conquistas());
            }

            // Atualizar um time
            time1.setTitulos(20);
            timesDAO.updateTime(time1);

            // Selecionar um time pelo ID
            Times selectedTime = timesDAO.selectTime(1);
            System.out.println(selectedTime.conquistas());

            // Deletar um time
            timesDAO.deleteTime(2);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
