package office;

public class Runner {
    public static void main(String[] args) {
        Boss boss = new Boss("Петр Николаевич", "Босс");
        Manager manager = new Manager("Володя", "Менеджер");
        Security security = new Security("Петрович", "Охранник");
        Secretary secretary = new Secretary("Секретарь");
        Office office = new Office(boss, manager, secretary, security);
        office.workDay();
    }
}

