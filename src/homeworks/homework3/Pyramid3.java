package homeworks.homework3;

public class Pyramid3 {

    public void print() {
        System.out.println("МММ");
    }

    static class Pyramid2 extends Pyramid3 {

        @Override
        public void print() {
            super.print();
            System.out.println("ММ");
        }
    }

    static class Pyramid1 extends Pyramid2 {

        @Override
        public void print() {
            super.print();
            System.out.println("М");
        }
    }
}


