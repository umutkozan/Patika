package Teknik_4;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Girilen Sayı: ");
        int number = scanner.nextInt();

        // Diziyi sırala
        Arrays.sort(list);

        // En yakın küçük sayıyı ve en yakın büyük sayıyı bul
        int closestSmaller = Integer.MIN_VALUE;
        int closestLarger = Integer.MAX_VALUE;

        for (int i : list) {
            if (i < number && i > closestSmaller) {
                closestSmaller = i;
            }
            if (i > number && i < closestLarger) {
                closestLarger = i;
            }
        }

        // Sonuçları yazdır
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + closestSmaller);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + closestLarger);
    }
}