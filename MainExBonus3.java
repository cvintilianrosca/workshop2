package oop_yeah.teaching;

import java.util.Scanner;

public class MainExBonus3 {

    static boolean contains3Digit(int number) {
        while (number != 0) {
            int remainder = number % 10;
            if (remainder == 3) {
                return true;
            }
            number /= 10;
        }
        return false;
    }

    static void fibonacciSequence(int number) {
        int firstNumber = 1;
        int secondNumber = 1;
        int current = 0;

        while (secondNumber <= number) {
            secondNumber = current + firstNumber;
            current = firstNumber;
            firstNumber = secondNumber;
            if (secondNumber > number) {
                break;
            }
            if (contains3Digit(secondNumber)) {
                System.out.println(secondNumber);
            }
        }

    }

    public static void main(String[] args) {

        // Algoritm
        // 1. Citim numarul
        // 2. Sa verificam daca un numar este prim?
        // 3. Sa verificam daca numarul prim este mai mic ca numarul de la tastatura
        // 4. Daca este mai mic, atunci il adaugam intr-o suma
        // 5. Daca suma respectiva este mai mica decat numarul nostru, repeat #3.

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        fibonacciSequence(number);
    }

}
