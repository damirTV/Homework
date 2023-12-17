package four.ex2;

public class Driver extends Being {
    private Human human;

    public Driver(Human human) {
        this.human = human;
    }

    @Override
    public String makeSound() {
        return "Я водитель " + human.makeSound();
    }
}
