package Homework1;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        /*Задача 3:
        Въведете 3 числа от клавиатурата ч1, ч2 и ч3.Разменете стойностите им така, че ч1 да има стойността на ч2, ч2
        да има стойността на ч3, а ч3 да има старатастойност на ч1.Съберете ч1 и ч2 и след това намерете разликата между
        получения сбор и ч3.Разпечатете стойностите на числата на етапи*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number1, please: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter number2, please: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter number3, please: ");
        int num3 = scanner.nextInt();

        int oldNum1 = num1;


        num1 = num2;
        System.out.println("Number 1 is equal to: " + num1);

        num2 = num3;
        System.out.println("Number 2 is equal to: " + num2);

        num3 = oldNum1;
        System.out.println("Number 3 is equal to: " + num3);

        int sum1 = num1 + num2;
        System.out.println("The sum of number1 and number2 is equal to: "+ sum1);

        int sum1MinusNumber3 = sum1 - num3;
        System.out.println("The sum of number1 and number2 minus number3 is equal to: " + sum1MinusNumber3);


    }
}
