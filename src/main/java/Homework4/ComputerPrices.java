package Homework4;

public class ComputerPrices {
    public static void main(String[] args) {
        Computer computer1 = new Computer(2008, "Windows");
        computer1.price = 1199.99;

        Computer computer2 = new Computer(2022, 1199.99, "Linux");

        int result = computer1.comparePrice(computer2);

        if (result == -1) {
            System.out.println("The price of the first computer is higher than the price of the second. ");
        } else if (result == 1) {
            System.out.println("The price of the second computer is higher than the price of the first.");
        } else {
            System.out.println("The prices of both computers are equal.");
        }
    }
}

