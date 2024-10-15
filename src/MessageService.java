import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MessageService {

    public void sendMessage(Message message) {
        String sql = "INSERT INTO Messages(match_id, sender_id, content, sent_at) VALUES (?, ?, ?, DEFAULT)";

        try (Connection conn = PostgreSQLConnection.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, message.getMatchId());
            pstmt.setInt(2, message.getSenderId());
            pstmt.setString(3, message.getContent());

            pstmt.executeUpdate();
            System.out.println("Message envoyé avec succès !");
        } catch (SQLException e) {
            System.out.println("Erreur lors de l'envoi du message : " + e.getMessage());
        }
    }
}
