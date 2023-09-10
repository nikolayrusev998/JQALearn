package Homework6;

public class Cat extends Animal{

    public void climp() {   // typo v uslovieto
        System.out.println("Kotkata kateri stenata");
    }
    @Override
    public void play() {
        System.out.println("Kotkata igrae");
    }

    @Override
    public void makeSomeNoise() {
        System.out.println("Meow meaw");
    }
}
