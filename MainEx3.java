package oop_yeah.teaching;

import java.util.Scanner;

public class MainEx3 {

    static boolean isIncreasingNumber(int number) {
        int lastDigit = number % 10;
        number /= 10;

        while (number != 0) {
            int currentDigit = number % 10;

            if (currentDigit > lastDigit) {
                return false;
            }

            lastDigit = currentDigit;
            number /= 10;
        }
        return true;
    }


    static boolean isDecreasingNumber(int number) {
        int lastDigit = number % 10;
        number /= 10;

        while (number != 0) {
            int currentDigit = number % 10;

            if (currentDigit < lastDigit) {
                return false;
            }

            lastDigit = currentDigit;
            number /= 10;
        }
        return true;
    }

    static void computeIsIncreasingNumberForRange(int lower, int upper) {
        for (int i = lower; i < upper; i++) {
            if (isIncreasingNumber(i)) {
                System.out.println(i);
            }
        }
    }


    static void computeIsDecreasingNumberForRange(int lower, int upper) {
        for (int i = lower; i < upper; i++) {
            if (isDecreasingNumber(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        // Problema https://edu.devmind.ro/java-1/algoritmi-de-baza-i#numere_crescatoare

        // 1. Citim numarul de la tastatura
        // 2. Extragem cate o cifra de la sfarsit si retinem cifra precedenta
        // 3. Comparam cifra curenta cu cifra precedenta
        // 4. Daca toate cifrele curente sunt mai mici sau egale cu cifrele precedente,
        // atunci numarul este crescator

        Scanner scanner = new Scanner(System.in);
        int lowerLimit = scanner.nextInt();
        int upperLimit = scanner.nextInt();

        computeIsDecreasingNumberForRange(lowerLimit, upperLimit);



    }

}
