package Homework2;

public class Task05 {
  /*  Задача 5
    Да се състави масив със следните стойности {10 12 1 8 4}. След създаването на масива да се копират стойностите в нов масив*/

    public static void main(String[] args) {
        int[] arrNumber1 = new int[]{10, 12, 1, 8, 4};
        int[] arrayNumber2 = new int[arrNumber1.length];

        for (int i = 0; i < arrNumber1.length; i++) {
            arrayNumber2[i] = arrNumber1[i];
        }

        //Proverka
        System.out.println(arrayNumber2[0]);
        System.out.println(arrayNumber2[1]);
        System.out.println(arrayNumber2[2]);
        System.out.println(arrayNumber2[3]);
        System.out.println(arrayNumber2[4]);


    }


}
