package four.ex3;

public class Builder implements Sound {
    private final Sound sound;

    public Builder(Sound sound) {
        this.sound = sound;
    }

    public String makeSound() {
        return ("Я строитель." + sound.makeSound());
    }
}
