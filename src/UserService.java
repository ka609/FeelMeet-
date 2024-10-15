import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserService {
    public void addUser(User user) {
        String sql = "INSERT INTO Users(user_name, email, password_hash) VALUES (?, ?, ?) RETURNING user_id";

        try (Connection conn = PostgreSQLConnection.connect();  // Appel de la méthode connect
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, user.getUserName());
            pstmt.setString(2, user.getEmail());
            pstmt.setString(3, user.getPasswordHash());

            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                int userId = rs.getInt("user_id");
                user.setUserId(userId);
            }
            System.out.println("Utilisateur ajouté avec succès !");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
