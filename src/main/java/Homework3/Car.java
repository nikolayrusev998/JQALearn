package Homework3;

public class Car {

    int year;
    double price;
    boolean isSportCar;
    double fuelTankCapacity;
    double freeFuel;
    String engineFuelOperationSystem;

    public void changeEngineFuelOperationSystem(String newEngineFuelOperationSystem) {
        engineFuelOperationSystem = newEngineFuelOperationSystem;
    }



    public void useFuel(double fuel) {
        if (fuel <= freeFuel) {
            freeFuel -= fuel;
        } else {
            System.out.println("Not enough free fuel!");
        }

    }

    public void displayCarDetails() {
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
        System.out.println("Is Sport Car: " + isSportCar);
        System.out.println("Fuel Tank Capacity: " + fuelTankCapacity);
        System.out.println("Free Fuel: " + freeFuel);
        System.out.println("Engine Fuel Operation System: " + engineFuelOperationSystem);
    }


}
