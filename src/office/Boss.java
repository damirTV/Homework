package office;

public class Boss {
    String name;
    String position;
    public Boss (String name, String position) {
        this.name = name;
        this.position = position;
    }
    public String say(String name) {
        return name + " быстрее!";
    }
}
