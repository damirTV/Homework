package four.ex1;

public class Car extends Vehicle {
    private boolean isCruiseControl = true;

    public Car(boolean isClean, double[] size, boolean isCruiseControl) {
        super(isClean, size);
        this.isCruiseControl = isCruiseControl;
    }
}
