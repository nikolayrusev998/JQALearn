package Homework2;

public class Task04 {
    /* Задача 4
     Напишете програма, която създава масив с 10 елемента от тип int и обходете масива:

     с помоща на for loop

     с помоща на while loop
     Да се изведат елементите на екрана.*/
    public static void main(String[] args) {


        int[] forArray = new int[10];
        for (int i = 0; i < forArray.length; i++) {
            forArray[i] = i + 1;
            System.out.println(forArray[i]);
        }

        System.out.println(); // za preglednost


        int[] whileArray = new int[10];
        int j = 0;
        while (j < whileArray.length) {
            whileArray[j] = j + 1;
            System.out.println(whileArray[j]);
            j++;
        }

    }
}
