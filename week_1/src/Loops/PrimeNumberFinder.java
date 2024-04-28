package Loops;
import java.util.Scanner;
public class PrimeNumberFinder {
    public static void main(String[] args) {
        System.out.println("Asal Sayılar (1-100):");

        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Bir sayının asal olup olmadığını kontrol eden metot
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
