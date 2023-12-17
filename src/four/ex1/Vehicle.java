package four.ex1;

public abstract class Vehicle {
    private boolean isClean;
    private final double[] size;

    public Vehicle(boolean isClean, double[] size) {
        this.isClean = isClean;
        this.size = size;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }

    public String category() {
        if (size[0] > 6 || size[1] > 2.5 || size[2] > 2) {
            return "Крупная";
        } else {
            return "Маломерная";
        }
    }
}
