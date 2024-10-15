import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgreSQLConnection {
    public static void main(String[] args) {
        // Informations sur la base de données
        String url = "jdbc:postgresql://localhost:5432/Java-projet";
        String user = "postgres";
        String password = "projet2024";

        // Connexion à la base de données
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            if (connection != null) {
                System.out.println("Connexion réussie à la base de données PostgreSQL !");
            } else {
                System.out.println("Échec de la connexion !");
            }
        } catch (SQLException e) {
            System.out.println("Erreur de connexion : " + e.getMessage());
        }
    }
}

