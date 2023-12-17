package four.ex1;

public class Bus extends Vehicle {
    private int maxPassengers;

    public Bus(boolean isClean, double[] size, int maxPassengers) {
        super(isClean, size);
        this.maxPassengers = maxPassengers;
    }
}
