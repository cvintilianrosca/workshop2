package oop_yeah.teaching;

import java.util.Scanner;

public class MainExBonus2 {

    static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void printPrimeSequence(int upperLimit) {
        int sum = 0;
        while (sum <= upperLimit) {
            for (int i = 2; i <= upperLimit; i++) {
                if (isPrime(i)) {
                    sum += i;
                    if (sum > upperLimit) {
                        break;
                    } else {
                        System.out.println(sum);
                    }
                }
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
        printPrimeSequence(number);
    }

}
