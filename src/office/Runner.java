package office;
public class Runner {
    public static void main(String[] args) {
        Boss boss = new Boss("Петр Николаевич", "Босс");
        Manager manager = new Manager("Володя", "Менеджер");
        Security security = new Security("Петрович", "Охранник");
        Secretary secretary = new Secretary("", "Секретарь");
        Office office = new Office(boss, manager, secretary, security);
        office.workDay();
    }
}

//import shop.Worker;
//public class Runner {
//    public static void main(String[] args) {
//    shop.Worker[] officeWorkers = new shop.Worker[4];
//    officeWorkers[0] = new Worker("Петр Николаевич", new Office().position[0], "Быстрее!");
//    officeWorkers[1] = new Worker("Володя", new Office().position[1], "я ничего не успеваю, помогите!");
//    officeWorkers[2] = new Worker("", new Office().position[2], "босс не волнуйтесь, менеджер все успеет. охранник - подождите");
//    officeWorkers[3] = new Worker("Петрович", new Office().position[3], "прошу выдать аванс");
//    //System.out.println(officeWorkers[0].position);
//    }
//}
