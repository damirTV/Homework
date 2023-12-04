package office;

//public class Office {
//    String[] position = {"Босс", "Менеджер", "Секретарь", "Охранник"};
//    public void workingDay(String name) {
//        System.out.println(name);
//    }
//}
public class Office {
    public Boss boss;
    public Manager manager;
    public Secretary secretary;
    public Security security;

    public Office(Boss boss, Manager manager, Secretary secretary, Security security) {
        this.boss = boss;
        this.manager = manager;
        this.secretary = secretary;
        this.security = security;
    }

    public void workDay() {
        System.out.println(boss.position + ": " + boss.say(manager.name));
        System.out.println(manager.position + ": " + manager.say());
        System.out.println(security.position + ": " + security.say());
        System.out.println(secretary.position + ": " + secretary.say(boss.name, manager.name, security.name));
    }
}

