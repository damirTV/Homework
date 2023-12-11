package homeworks.homework3;

//Реализовать в Java следующую схему (в скобках свойства объектов)
//У нас есть Дерево(возраст)
//Деревья делятся на:
//хвойные(имеют тип иголок)
//лиственные(есть листья на дереве сейчас), умеют опадать (листья пропадают с дерева)
//умеют цвести (листья появляются)
//
//Сосна и Ель являются хвойными.
//для сосны характерен тип иголок - крупный
//для ели характерен тип иголок - мелкий
//
//Береза является лиственным деревом.
//Когда Береза цветет, помимо появления листьев, она источает аллергены (печать в консоль)

public class Tree {
    private int age;

    public Tree(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    static class Deciduous extends Tree { // Класс лиственных деревьев
        private boolean isLeaves;

        public Deciduous(int age, boolean isLeaves) {
            super(age);
            this.isLeaves = isLeaves;
        }

        public boolean getIsLeves() {
            return isLeaves;
        }

        public void leavesFall() {
            System.out.println("Листья падают с дерева");
            isLeaves = false;
        }

        public void leavesGrow() {
            System.out.println("Листья растут");
            isLeaves = true;
        }
    }

    static class Birch extends Deciduous { // Класс береза

        public Birch(int age, boolean isLeaves) {
            super(age, isLeaves);
        }

        public void leavesGrow() {
            super.leavesGrow();
            System.out.println("Источает аллергены");
        }
    }

    static class Coniferous extends Tree { // Класс хвойных деревьев
        private final String typeOfNeedles;

        public Coniferous(int age, String typeOfNeedles) {
            super(age);
            this.typeOfNeedles = typeOfNeedles;
        }

        public String getTypeOfNeedles() {
            return typeOfNeedles;
        }
    }

    static class Pine extends Coniferous { // Класс сосна

        public Pine(int age) {
            super(age, "крупный");
        }
    }

    static class Fir extends Coniferous { // Класс ель

        public Fir(int age) {
            super(age, "мелкий");
        }
    }
}

