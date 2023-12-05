package office;

public class Security {
    String name;
    String position;

    public Security(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public String say() {
        return "прошу выдать мне аванс!";
    }
}
