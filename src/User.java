public class User {
    private int userId;  // L'ID de l'utilisateur
    private String userName;
    private String email;
    private String passwordHash;

    // Constructeur pour la classe User
    public User(String userName, String email, String passwordHash) {
        this.userName = userName;
        this.email = email;
        this.passwordHash = passwordHash;
    }

    // Méthode pour obtenir l'ID utilisateur
    public int getUserId() {
        return userId;
    }

    // Méthode pour définir l'ID utilisateur après ajout dans la base de données
    public void setUserId(int userId) {
        this.userId = userId;
    }

    // Méthodes getters et setters pour les autres champs
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }
}
