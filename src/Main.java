public class Main {
    public static void main(String[] args) {
        // Service utilisateur
        UserService userService = new UserService();

        // Ajout d'utilisateurs dans la base de données
        User user1 = new User("Jean Dupont", "jean.dupont@example.com", "hashed_password_1");
        User user2 = new User("Marie Dubois", "marie.dubois@example.com", "hashed_password_2");
        userService.addUser(user1);
        userService.addUser(user2);

        // Récupérer les IDs des utilisateurs après les avoir ajoutés
        int user1Id = user1.getUserId();
        int user2Id = user2.getUserId();

        // Service des profils
        ProfileService profileService = new ProfileService();

        // Ajout de profils liés aux utilisateurs
        Profile profile1 = new Profile(user1Id, "Je suis Jean, j'adore la technologie.", 28, "M", "Tech, Sport", "Paris");
        Profile profile2 = new Profile(user2Id, "Je suis Marie, passionnée par l'art.", 25, "F", "Art, Musique", "Lyon");
        profileService.addProfile(profile1);
        profileService.addProfile(profile2);

        // Service des préférences
        PreferenceService preferenceService = new PreferenceService();

        // Ajout des préférences pour les utilisateurs
        Preference preference1 = new Preference(user1Id, 18, 30, "F");
        Preference preference2 = new Preference(user2Id, 20, 35, "M");
        preferenceService.addPreference(preference1);
        preferenceService.addPreference(preference2);

        // Service des correspondances (matches)
        MatchService matchService = new MatchService();

        // Création d'une correspondance entre deux utilisateurs
        Match match = new Match(user1Id, user2Id);
        matchService.createMatch(match);

        // Service des messages
        MessageService messageService = new MessageService();

        // Envoi d'un message dans la correspondance entre user1 et user2
        Message message = new Message(match.getMatchId(), user1Id, "Bonjour Marie, comment vas-tu ?");
        messageService.sendMessage(message);

        // Envoi d'une réponse de user2 à user1
        Message response = new Message(match.getMatchId(), user2Id, "Salut Jean, je vais bien, merci ! Et toi ?");
        messageService.sendMessage(response);

        System.out.println("Toutes les opérations ont été effectuées avec succès !");
    }
}
