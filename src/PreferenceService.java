import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreferenceService {

    public void addPreference(Preference preference) {
        String sql = "INSERT INTO Preferences(user_id, age_range_min, age_range_max, gender_preference) VALUES (?, ?, ?, ?)";

        try (Connection conn = PostgreSQLConnection.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, preference.getUserId());
            pstmt.setInt(2, preference.getAgeRangeMin());
            pstmt.setInt(3, preference.getAgeRangeMax());
            pstmt.setString(4, preference.getGenderPreference());

            pstmt.executeUpdate();
            System.out.println("Préférence ajoutée avec succès !");
        } catch (SQLException e) {
            System.out.println("Erreur lors de l'ajout de la préférence : " + e.getMessage());
        }
    }
}
