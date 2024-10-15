import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProfileService {

    public void addProfile(Profile profile) {
        String sql = "INSERT INTO Profiles(user_id, bio, age, gender, interests, location) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = PostgreSQLConnection.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, profile.getUserId());
            pstmt.setString(2, profile.getBio());
            pstmt.setInt(3, profile.getAge());
            pstmt.setString(4, profile.getGender());
            pstmt.setString(5, profile.getInterests());
            pstmt.setString(6, profile.getLocation());

            pstmt.executeUpdate();
            System.out.println("Profil ajouté avec succès !");
        } catch (SQLException e) {
            System.out.println("Erreur lors de l'ajout du profil : " + e.getMessage());
        }
    }
}
