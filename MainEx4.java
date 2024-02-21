package oop_yeah.teaching;

// Noua ca oameni, ne plac numere de genul 1234567890
// 010101010101010101010 -> electronica
// 0 si 1
// curent contii DC
// Voltaj -> 0 si 5V
// 0 - 2.5V -> 0
// 2.5V - 5V -> 1

// 1223456
// 0101010

// Niste reguli matematici de conversie a numerele intregi
// Orice numar din baza 10 poate fi scris in alta baza, de exemplu baza 2
// Orice numar din baza 2, poate fi scris in baza 10

// Tre' sa scriem um programel care
// prin magie transforma un numar de forma 1234 -> 0101010101

// Exista vreun algoritm matematic, sau ceva ce ne permite sa facem asta

// 8 = 2 * 2 * 2 = 2^3
// 16 = 2 * 2 * 2 * 2 = 2^4

// 10 -> 2

//    putere   3 2 1 0

//     digit   0 0 0 0 -> suma1..n(2 ^putere *(0_1_digit))  = 2^putere* digit
//             0 0 0 1  -> (2^0 * 1) + (2^1 * 0) + (2^2 * 0) + (2^3 * 0) = 1 + 0 + 0 + 0 = 1
//             0 1 0 0  -> (2^0 * 0) + (2^1 * 0) + (2^2 * 1) + (2^3 * 0) = 0 + 0 + 4 * 0 = 4
//             1 0 0 1  -> (2^0 * 1) + (2^1 * 0) + (2^2 * 0) + (2^3 * 1) = 1 + 0 + 0 + 8 = 9
//             1 1 1 0  -> (2^0 * 0) + (2^1 * 1) + (2^2 * 1) + (2^3 * 1) = 0 + 2 + 4 + 8 = 14

// 1 ->  0001
// 2 ->  0010
// 3 ->  0011
// 4 ->  0100
// 5 ->  0101
// 6 ->  0110
// 7 ->  0111
// 8 ->  1000
// 9 ->  1001
// 10 -> 1010
// 11 -> 1011
// 12 -> 1100
// 13 -> 1101
// 14 -> 1110
// 15 -> 1111

// 15 -> 1111
// 15 % 2 = 1
// 7 % 2 =  1
// 3 % 2 =  1
// 1 % 2 =  1

// 13 -> 1101

// 13 % 2 -> 1
// 6 % 2 ->  0
// 3 % 2 ->  1
// 1 % 2 ->  1

// 10 -> 1010

// 10 % 2 = 0
// 5 % 2 =  0
// 2 % 2 =  0
// 1 % 2 =  1


// 0
// 9
// A
// B
// C
// D
// E
// F

// 0x001FFDDA



// 0101
// 10
// 101
// 1010
import java.util.Scanner;

public class MainEx4 {

    int number = 0xFFAADD;
    int numberBinary = 0b1111;

    static void convertFromDecimalToBinaryBase(int number) {
        int result = 0;
        int decimalPlace = 1;
        while (number > 0) {
            int remainder = number % 2;
            result = result + (remainder * decimalPlace);
            decimalPlace = decimalPlace * 10;
            number /= 2;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {

        // Algoritm
        // 1. Citim un numar de la tastatura
        // 2. Generam fiecare bit de ala prin a face numar % 2
        // 3. Impartim la 2
        // 4. Cumva il citim de jos in sus

        Scanner scanner = new Scanner(System.in);
        final int number = scanner.nextInt();
        convertFromDecimalToBinaryBase(number);

    }

}
