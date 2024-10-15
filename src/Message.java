public class Message {
    private int matchId;
    private int senderId;
    private String content;

    public Message(int matchId, int senderId, String content) {
        this.matchId = matchId;
        this.senderId = senderId;
        this.content = content;
    }

    public int getMatchId() {
        return matchId;
    }

    public int getSenderId() {
        return senderId;
    }

    public String getContent() {
        return content;
    }
}

