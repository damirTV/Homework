package office;

public class Secretary {
    String position;

    public Secretary(String position) {
        this.position = position;
    }

    public String say(String nameBoss, String nameManager, String nameSecurity) {
        return nameBoss + " не волнуйтесь, " + nameManager + " все успеет. "
                + nameSecurity + " - подождите!";
    }
}
