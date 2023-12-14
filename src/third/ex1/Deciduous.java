package third.ex1;

class Deciduous extends Tree { // Класс лиственных деревьев
    private boolean isLeaves;

    public Deciduous(int age, boolean isLeaves) {
        super(age);
        this.isLeaves = isLeaves;
    }

    boolean getIsLeaves() {
        return isLeaves;
    }

    void leavesFall() {
        System.out.println("Листья падают с дерева");
        isLeaves = false;
    }

    void leavesGrow() {
        System.out.println("Листья растут");
        isLeaves = true;
    }
}
