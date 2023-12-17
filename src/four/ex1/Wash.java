package four.ex1;

public class Wash {
    public int washingVehicle(Vehicle vehicle) {
        vehicle.setClean(true);
        if (vehicle.category() == "Крупная") {
            return 4000;
        } else {
            return 2000;
        }
    }
    
    public int washingVehicles(Vehicle[] vehicles) {
        int totalCost = 0;
        for (Vehicle vehicle : vehicles) {
            totalCost += washingVehicle(vehicle);
        }
        return totalCost;
    }
}
