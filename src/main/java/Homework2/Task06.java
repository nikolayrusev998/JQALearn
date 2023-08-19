package Homework2;

public class Task06 {
    //Дадени са два масива със стойности {1, 2, 3} и  {1, 2, 3} да се състави програма, която проверява дали масивите са еднакви

    public static void main(String[] args) {
        int[] arrayNumber1 = new int[]{1, 2, 3};
        int[] arrayNumber2 = new int[]{1, 2, 3};
        boolean areEqual = areArraysEqual(arrayNumber1, arrayNumber2);

        if (areEqual) {
            System.out.println("The arrays are equal.");
        } else {
            System.out.println("The arrays are not equal.");
        }
    }
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }
}
