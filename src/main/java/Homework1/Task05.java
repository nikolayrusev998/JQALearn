package Homework1;

public class Task05 {
    public static void main(String[] args) {
        /*Задача 5:
        Да се изведат числата от 1 до 100 във възходящ и в низходящ ред и да се отпечатат получените резултати с помоща на for цикъл*/

        for(int i=1; i<=100; i++){
            System.out.println(i  );
        }

        System.out.println(" "); // Да разделя двата цикъла, за прегледност


        for(int j=100; j>=1; j--){
            System.out.println(j);
        }

    }
}
