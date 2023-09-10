package Homework6;

public class Bird extends Animal {

    public void fly() {
        System.out.println("Fly like a bird");
    }

    public void synk(int numberOfBirds) {   // typo v uslovieto

        if (numberOfBirds <= 1) {
            System.out.println("quiet sound");
        } else {
            System.out.println("louder sound");


        }


    }

    @Override
    public void play() {

        System.out.println("Ptichkata igrae");
    }

    @Override
    public void makeSomeNoise() {
        System.out.println("Tweet tweet");
    }
}
