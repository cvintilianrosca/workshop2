package oop_yeah.teaching;

import java.util.Scanner;

public class MainExBonus1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println((number / 5) * 5);

        for (int i = number; i > 0 ; i--) {
            if (i % 5 == 0) {
                System.out.println(i);
                break;
            }
        }




        // 23
        // cel mai mare multiplu de 5 care e mai mic ca < 23
        // Raspuns: - 20
        //Algoritm:
        // citim un numar;
        //
    }

}
