package Homewrok3;

public class CarPerson {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.year = 2020;
        car1.price = 10000;
        car1.isSportCar = true;
        car1.fuelTankCapacity = 60;
        car1.freeFuel = 40;
        car1.engineFuelOperationSystem = "Benzin";

        // car1.displayCarDetails();

        Car car2 = new Car();
        car2.year = 2014;
        car2.price = 5000;
        car2.isSportCar = false;
        car2.fuelTankCapacity = 70;
        car2.freeFuel = 32;
        car2.engineFuelOperationSystem = "Gas";

        // car2.displayCarDetails();

        car1.useFuel(20);
        car2.changeEngineFuelOperationSystem("Diesel");

        System.out.println("Details for Car 1: ");
        car1.displayCarDetails();

        System.out.println("Details for Car 2: ");
        car2.displayCarDetails();


    }
}
