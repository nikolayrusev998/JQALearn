package Homework1;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


      /*  Задача 1:
        Да се изпишат подканващи съобщения към user, с които да въведе две числа от клавиатурата(тип int или double).
        След всяко въвеждане числата да бъдат отпечатени с подходящ текст.Да се въведе и 3 - то число като се провери
        дали то е между първото и второто, като се изведе подходящо съобщение.*/

        System.out.println("Enter number1, please: ");
        double number1 = scanner.nextDouble();
        System.out.println(number1);

        System.out.println("Enter number2, please: ");
        double number2 = scanner.nextDouble();
        System.out.println(number2);

        System.out.println("Enter number3, please: ");
        double number3 = scanner.nextDouble();

        if ((number3 > number1 && number3 < number2) || (number3 < number1 && number3 > number2)) {
            System.out.println("The number3 is in between number1 and number 2");

        } else {
            System.out.println("The number 3 isn't not between number1 and number2");
        }

    }
}
