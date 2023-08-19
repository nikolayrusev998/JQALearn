package Homework2;

import java.util.Scanner;

public class Task01 {
    /* Задача 1:
     Да се състави метод, който приема като аргументи две числа и отпечатва на екрана техния сбор.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number for X, please: ");
        int x = scanner.nextInt();
        System.out.println("Enter number for Y, please: ");
        int y = scanner.nextInt();

        sum(x, y);
    }

    static void sum(int x, int y) {

        System.out.println(x + y);
    }
}
