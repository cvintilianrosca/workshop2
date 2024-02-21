package oop_yeah.teaching;

import java.util.Scanner;

public class MainEx5 {

    static void fibonacciSequence(int number) {

        if (number == 1) {
            System.out.println(number + "-> " + true + "( " + 1 + ")");
            return;
        }
        int firstNumber = 1;
        int secondNumber = 1;
        int current = 0;
        int counter = 1;

        while (secondNumber <= number) {
            if (secondNumber == number) {
                System.out.println(number + "-> " + true + "( " + counter + ")");
            }
            secondNumber = current + firstNumber;
            current = firstNumber;
            firstNumber = secondNumber;
            counter++;
        }

        System.out.println(number + "-> " + false);


    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        while (number != -1) {
            fibonacciSequence(number);

            number = scanner.nextInt();
        }

        // 1, 2, 3, 4, 5, 6, 7, 8.. -> infint

        // 1, 2, 3, 5, 7, 11, 13, 17.. infinit

        // 2, 4, 8, 10

        // 1, 1, 2, 3, 5, 8, 13, 21, 34
        // fiecare numar este generat ca suma precedentelor sale
        // 1
        // 1
        // 2 -> 1 + 1
        // 3 -> 2 + 1
        // 5 -> 2 + 3
        // 8 -> 5 + 3

        // Algoritm
        // Primele 2 numerele din Fibonnaci sunt 1 si 1 si le stim
        // cu un for le generam pe toate I gues
        // for de la 0 la numarul tau si le generezi
        // Care este regula la fibonacii
        // numarul curent = numarul precedent + nuarul maiprecedent
        // n = (n - 1) + (n - 2)

    }

}
