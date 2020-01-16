import java.sql.*;

public class DatabaseConnection {

    public Connection Connect() {
        try {
            String connectionUrl = "jdbc:sqlserver://LenovoIdeapadL340RubenvdRande;databaseName=NetflixStatistixDatabase;user=netflix;password=#PhJbh2H;";

            // 'Importeer' de driver die je gedownload hebt.
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // Maak de verbinding met de database.
            Connection con = DriverManager.getConnection(connectionUrl);

            return con;
        }

        catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}