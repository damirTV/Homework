package third.ex5;

public class House {
    private String street;
    private int number;

    public House(String street, int number) {
        this.street = street;
        this.number = number;
    }

    @Override
    public String toString() {
        return street + "-" + number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
