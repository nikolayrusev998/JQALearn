package Homework2;

import java.util.Scanner;

public class Task02 {
   /* Задача 2
    Да се състави метод, който приема като аргументи две числа и връща тяхното средноаритметично.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number for X, please: ");
        int x = scanner.nextInt();
        System.out.println("Enter number for Y, please: ");
        int y = scanner.nextInt();
        average(x, y);
    }

    static void average(double x, double y) {
        System.out.println((x + y) / 2);
    }
}
