package third.ex5;

import java.util.Arrays;

public final class City {
    private final String name;
    private final House[] houses;


    public City(String name, House[] houses) {
        this.name = name;
        this.houses = houses;
    }

    public String getName() {
        return name;
    }

    public House[] getHouses() {
        House[] copyHouses = new House[houses.length];
        for (int i = 0; i < houses.length; i++) {
            copyHouses[i] = houses[i];
        }
        return copyHouses;
    }

    @Override
    public String toString() {
        return getName() + " " + Arrays.toString(houses);
    }
}
