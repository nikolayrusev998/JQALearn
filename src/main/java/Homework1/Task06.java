package Homework1;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {

       /* Задача 6:
        Да се въведе число от клавиатурата от 1 до 7 и да се изведе съобщение кой ден от седмицата отговаря на съответно число с подходящо съобщение*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 7, please: ");
        int i = scanner.nextInt();

        switch (i) {
            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            case 4:
                System.out.println("Today is Thursday");
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Enter a number from 1 to 7, please!!!");

        }
    }
}
