package oop_yeah.teaching;

import java.util.Scanner;

class MainEx1 {

    static boolean isDivisor(int divisor, int n) {
        return n % divisor == 0;
    }

    static int computeDivisorsSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (isDivisor(i, n)) {
                sum += i;
            }
        }
        return sum;
    }

    static void isPerfectNumber(int n, int sum) {
        if (sum == n) {
            System.out.println(n + " -> Este numar perfect.");
        } else {
            System.out.println(n + " -> Nu este numar perfect.");
        }
    }

    static void printAllPerfectNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            final int sum = computeDivisorsSum(i);
            isPerfectNumber(i, sum);
        }
    }




    public static void main(String[] args) {

        // Cum am face asta? -> Scriem niste pasi -> Algoritm
        // 1. -> Citim un numar n de la tastatura -> probabil cu Scanner
        // 2. -> Pentru numarul citit calculam suma divizorilor -> probabil cu o metoda
        // 3. -> Verificam daca suma respectiva este egala cu numarul citit de la tastatura

        final Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printAllPerfectNumbers(n);

        // final int sum = computeDivisorsSum(n);
        // isPerfectNumber(n, sum);

    }

}