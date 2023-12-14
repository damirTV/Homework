package third.ex5;

import java.util.Arrays;

public final class City {
    private final String name;
    private final House[] houses;
    private final House[] copyhouses;

    public City(String name, House[] houses) {
        this.name = name;
        this.houses = houses;
        this.copyhouses = houses;
        System.arraycopy(houses, 0, copyhouses, 0, houses.length);
    }

    public String getName() {
        return name;
    }

    public House[] getHouses() {
        return copyhouses;
    }

    @Override
    public String toString() {
        return getName() + " " + Arrays.toString(houses);
    }
}
