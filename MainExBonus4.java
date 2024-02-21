package oop_yeah.teaching;

import java.util.Scanner;

public class MainExBonus4 {

    static void generatePythagoreanTriples(int upperLimit) {
        for (int a = 1; a < upperLimit; a++) {
            for (int b = 2; b < upperLimit; b++) {
                for (int c = 3; c < upperLimit; c++) {
                    if (a * a + b * b == c * c && (a < b) && (b < c) ) {
                        System.out.println(a + " " + b + " " + c);
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
        int upperLimit = scanner.nextInt();
        generatePythagoreanTriples(upperLimit);

    }

}
