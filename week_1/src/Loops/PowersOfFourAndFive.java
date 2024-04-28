package Loops;

import java.util.Scanner;

public class PowersOfFourAndFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int sayi = scanner.nextInt();
        for (int i = 1; i < sayi; i *= 5) {
            System.out.println("Girilen sayıya kadar 5'in kuvveti : " + i);
        }
        for (int l = 1; l < sayi; l *= 4) {
            System.out.println("Girilen sayıya kadar 4'ün kuvveti: " + l);
        }
    }
}
/*Java döngüler ile girilen sayıya kadar olan
4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz. */