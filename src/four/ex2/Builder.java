package four.ex2;

public class Builder extends Being {
    private Human human;

    public Builder(Human human) {
        this.human = human;
    }

    @Override
    public String makeSound() {
        return "Я строитель " + human.makeSound();
    }
}
