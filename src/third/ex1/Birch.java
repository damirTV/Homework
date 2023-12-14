package third.ex1;

public class Birch extends Deciduous { // Класс береза

    public Birch(int age, boolean isLeaves) {
        super(age, isLeaves);
    }

    public void leavesGrow() {
        super.leavesGrow();
        System.out.println("Источает аллергены");
    }
}
