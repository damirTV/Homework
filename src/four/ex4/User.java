package four.ex4;

public class User {
    private String nameUser;
    private String pwdUser;

    public User(String nameUser, String pwdUser) {
        this.nameUser = nameUser;
        this.pwdUser = pwdUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getPwdUser() {
        return pwdUser;
    }

    public void setPwdUser(String pwdUser) {
        this.pwdUser = pwdUser;
    }

    public void createUser(int idUser) {

    }
}
