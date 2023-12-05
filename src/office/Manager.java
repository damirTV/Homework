package office;

public class Manager {
    String name;
    String position;

    public Manager(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public String say() {
        return "я ничего не успеваю, помогите!";
    }
}
