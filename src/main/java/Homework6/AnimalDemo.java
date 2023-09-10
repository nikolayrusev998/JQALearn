package Homework6;

public class AnimalDemo {
    public static void main(String[] args) {

        Bird bird = new Bird();
        bird.name = "Woody kalvacha";
        bird.color = "Red and Black";
        bird.age = 83;
        bird.gender = "Male";
        bird.breed = "Woodpecker";

        bird.play();
        bird.makeSomeNoise();
        bird.fly();
        bird.synk(1);

        System.out.println("");


        Cat cat = new Cat();
        cat.name = "Tom";
        cat.color = "Gray";
        cat.age = 20;
        cat.gender = "Male";
        cat.breed = "Domestic Shorthair";

        cat.play();
        cat.makeSomeNoise();
        cat.climp();

        System.out.println("");


        Dog dog = new Dog();
        dog.name = "Kabosu";
        dog.color = "Orange";
        dog.age = 17;
        dog.gender = "Female";
        dog.breed = "Shiba inu";

        dog.play();
        dog.makeSomeNoise();
        dog.bringStick();

    }
}
