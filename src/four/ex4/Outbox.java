package four.ex4;

public class Outbox {
    private String nameUser;
    private String messageUser;
    private String toUser;

    public Outbox(String nameUser, String messageUser, String toUser) {
        this.nameUser = nameUser;
        this.messageUser = messageUser;
        this.toUser = toUser;
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

    public String getToUser() {
        return toUser;
    }

    public void setToUser(String toUser) {
        this.toUser = toUser;
    }
}
