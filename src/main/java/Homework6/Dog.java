package Homework6;

public class Dog extends Animal{
    @Override
    public void play() {
        System.out.println("Kucheto igrae");

    }

    @Override
    public void makeSomeNoise() {
        System.out.println("Woof woof ");

    }

    public void bringStick(){
        System.out.println("Kucheto shte donese topkata");
    }
}
