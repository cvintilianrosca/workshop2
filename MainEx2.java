package oop_yeah.teaching;

import java.util.Scanner;

public class MainEx2 {

    static int computeSumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }

    static boolean isMagicNumber(int number) {
        return number == 3 || number == 7 || number == 9;
    }

    static void computeMagicNumber(int number) {

        int receivedNumber = number;

        while (number >= 10) {
            number = computeSumOfDigits(number);
        }

        if (isMagicNumber(number)) {
            System.out.println(receivedNumber + " -> este numar magic");
        } else {
            System.out.println(receivedNumber + " -> nu este numar magic");
        }
    }

    public static void main(String[] args) {

        // 1. Citim un numar de la tastatura
        // 2. Ar fi sa impartim cumva numarul asta in cifrele sale
        // 3. Adunam cifrele sale
        // 4. Daca suma e 1 numar de 1 cifra, atunci verificam daca acea cifra este 3, 7 sau 9
        // 4. Daca nu e un numar de 1 cifra, refacem suma cifrelor si tot repetam pana ajungem la un numar de o cifra

        Scanner scanner = new Scanner(System.in);
        int lowerLimit = scanner.nextInt();
        int upperLimit = scanner.nextInt();

        for (int i = lowerLimit; i <= upperLimit; i++) {
            computeMagicNumber(i);
        }

    }

}
