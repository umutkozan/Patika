package Loops;

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir Sayı Gir :");
        int a = scanner.nextInt();

        for (int i = 0; i <= a; i++) {
            for (int b = 0; b < (a - i); b++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }
        for (int i = a - 1; i >= 0; i--) {
            for (int b = 0; b < (a - i); b++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }
    }
}

