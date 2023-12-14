package third.ex1;

class Coniferous extends Tree { // Класс хвойных деревьев
    private final String typeOfNeedles;

    public Coniferous(int age, String typeOfNeedles) {
        super(age);
        this.typeOfNeedles = typeOfNeedles;
    }

    String getTypeOfNeedles() {
        return typeOfNeedles;
    }
}
