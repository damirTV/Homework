package office;

public class Secretary {
    String name;
    String position;

    public Secretary(String name, String position) {
        this.name = name;
        this.position = position;
    }
    public String say(String bossName, String managerName, String securityName) {
        return bossName + " не волнуйтесь, " + managerName + " все успеет. " +
                securityName + " подождите!";
    }
}
