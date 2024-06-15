import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TimesDAO {
    private String jdbcURL = "jdbc:mysql://localhost:3306/timesdb";
    private String jdbcUsername = "root";
    private String jdbcPassword = "password";

    private static final String INSERT_TIMES_SQL = "INSERT INTO times (nome, titulos, alcunha) VALUES (?, ?, ?);";
    private static final String SELECT_TIMES_BY_ID = "SELECT id, nome, titulos, alcunha FROM times WHERE id = ?";
    private static final String SELECT_ALL_TIMES = "SELECT * FROM times";
    private static final String DELETE_TIMES_SQL = "DELETE FROM times WHERE id = ?;";
    private static final String UPDATE_TIMES_SQL = "UPDATE times SET nome = ?, titulos = ?, alcunha = ? WHERE id = ?;";

    public TimesDAO() {}

    protected Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public void insertTime(Times time) throws SQLException {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_TIMES_SQL)) {
            preparedStatement.setString(1, time.getNome());
            preparedStatement.setInt(2, time.getTitulos());
            preparedStatement.setString(3, time.getAlcunha());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
    }

    public Times selectTime(int id) {
        Times time = null;
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_TIMES_BY_ID);) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String nome = rs.getString("nome");
                int titulos = rs.getInt("titulos");
                String alcunha = rs.getString("alcunha");
                time = new Times(id, nome, titulos, alcunha);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return time;
    }

    public List<Times> selectAllTimes() {
        List<Times> times = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_TIMES);) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                int titulos = rs.getInt("titulos");
                String alcunha = rs.getString("alcunha");
                times.add(new Times(id, nome, titulos, alcunha));
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return times;
    }

    public boolean deleteTime(int id) throws SQLException {
        boolean rowDeleted;
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(DELETE_TIMES_SQL);) {
            statement.setInt(1, id);
            rowDeleted = statement.executeUpdate() > 0;
        }
        return rowDeleted;
    }

    public boolean updateTime(Times time) throws SQLException {
        boolean rowUpdated;
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(UPDATE_TIMES_SQL);) {
            statement.setString(1, time.getNome());
            statement.setInt(2, time.getTitulos());
            statement.setString(3, time.getAlcunha());
            statement.setInt(4, time.getId());

            rowUpdated = statement.executeUpdate() > 0;
        }
        return rowUpdated;
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}
