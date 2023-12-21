package four.ex4;

public class Inbox {
    private String nameUser;
    private String messageUser;
    private String fromUser;

    public Inbox(String nameUser, String messageUser, String fromUser) {
        this.nameUser = nameUser;
        this.messageUser = messageUser;
        this.fromUser = fromUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getMessageUser() {
        return messageUser;
    }

    public void setMessageUser(String messageUser) {
        this.messageUser = messageUser;
    }

    public String getFromUser() {
        return fromUser;
    }

    public void setFromUser(String fromUser) {
        this.fromUser = fromUser;
    }
}
