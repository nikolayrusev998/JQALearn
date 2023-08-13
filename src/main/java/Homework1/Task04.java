package Homework1;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
       /* Задача 4:
        Въведете 3 променливи от клавиатурата – брой работни часове (целочислен тип), сума пари (число
                с плаваща запетая), дали е почивен ден – булев тип. Съставете програма, която взема решения на базата на тези данни по следния начин:

     -   ако не е почивен ден ще работя

      -  ако имам пари и е почивен ден ще отида на кино

       - ако нямам – ще стоя вкъщи и ще гледам телевизия

        -ако е почивен ден

       - ако имам по-малко от 10 лв ще отида за сладолед*/

        Scanner scanner = new Scanner(System.in);

        // Решение 1 (какво си мисля, че е имал предвид автора на задачата

        System.out.println("Enter workhours, please: ");
        int workHours = scanner.nextInt();
        System.out.println("Enter how much money you have, please: ");
        double money = scanner.nextDouble();
        System.out.println("Enter is it a day off: ");
        boolean isItADayOff = scanner.nextBoolean();

        if (isItADayOff == false) {
            System.out.println("I will work");
        } else if (isItADayOff == true && money >=10){
            System.out.println("I'll go to the cinema");
        } else if (isItADayOff == true && money <=0){
            System.out.println("I'll stay home and watch TV");
        } else if (isItADayOff == true && money <10){
            System.out.println("I'll buy some Ice cream");
        }


        //Решение 2 ( Буквално какво пише на задачата)

        /*
        if (isItADayOff ==false){
            System.out.println("I'll work");
        } else System.out.println("I won't work today");

        if (isItADayOff==true && money >0){
            System.out.println("I'll go to the Cinema");
        }else if (isItADayOff==true && money <10){
            System.out.println("I will stay home and watch TV"); // В този елсе няма как да влезем
        }

        if (money <10){
            System.out.println("I'll buy some Ice cream");
        }*/



    }
}

