package Homework1;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*Задача 2:
        Въведете 4 различни числа от конзолата и разменте стойността им две по две.Нека числата бъдат от различен тип (
        int и duoble).Разпечатайте новите им стойности.Направете кастване (casting) конвертиране на числата веднъж от
        int to double и после от double to int и след всяко конвертиране изведете сумата им*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number1 (int), please: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter number2 (double), please: ");
        double number2 = scanner.nextDouble();

        System.out.println("Enter number3 (int), please: ");
        int number3 = scanner.nextInt();
        System.out.println("Enter number4 (double), please: ");
        double number4 = scanner.nextDouble();


        int sum1 = number1 + (int)number2;
        System.out.println("The sum of number1 and number2 is: " + sum1);

        double sum2 = (double)number3 + number4;
        System.out.println("The sum of number3 and number4 is: " +sum2);

    }
}
