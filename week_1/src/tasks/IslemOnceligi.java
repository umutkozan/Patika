package tasks;

import java.util.Scanner;

public class IslemOnceligi {
    public static void main(String[] args) {
        Scanner sayiGir = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz : ");
        int a = sayiGir.nextInt();
        System.out.println("İkinci sayıyı giriniz : ");
        int b = sayiGir.nextInt();
        System.out.println("Ucuncu sayıyı giriniz : ");
        int c = sayiGir.nextInt();
        double islem = a + b * c - b;
        System.out.println("Sayıların islem onceliğine gore sonucu : " + islem);
    }

}
