package Homework2;

public class Task03 {
  /*  Задача 3
    Да се прочете масив от екрана с 5 числа по избор от тип double и да се отпечатат всички резултати*/

    public static void main(String[] args) {
        double[] array = new double[5];
        array[0] = 1.2;
        array[1] = 2.4;
        array[2] = 3.5;
        array[3] = 4.3;
        array[4] = 5.5;

        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }
}
