package Methods;

import java.util.Scanner;

public class Calculator {
    static int topla(int a, int b) {
        int result = a + b;
        System.out.println("Toplama : " + result);
        return result;
    }

    static int cikar(int a, int b) {
        int result = a - b;
        System.out.print("Çıkarma : " + result);
        return result;
    }

    static int bolme(int a, int b) {
        int result = a / b;
        System.out.print("Bolme : " + result);
        return result;
    }

    static int carp(int a, int b) {
        int result = a * b;
        System.out.print("Çarp : " + result);
        return result;
    }

    static int us(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= b;
        }
        return result;
    }

    static int mod(int a, int b) {
        int result = a % b;
        return result;
    }

    static void dikdortgen(int a, int b) {
        int alan = (a * b);
        System.out.print("Dikdörtgenin alanı :" + alan);
        int cevre = (2 * (a + b));
        System.out.print("Dikdörgenin cevresi : " + cevre);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select;

        String menu = "\n1- Toplama işlemi\n" +
                "2- Çıkarma işlemi\n" +
                "3- Carpma işlemi\n" +
                "4- Bolme işlemi\n" +
                "5- Üslü Sayı Hesaplama\n" +
                "6- Mod Alma\n" +
                "7- Dikdörtgen Alan ve Çevre Hesabı\n" +
                "0- Çikis Yap \n";
        while (true) {
            System.out.print(menu);
            System.out.print("Bir işlem seçiniz : \n");
            select = scanner.nextInt();
            if (select == 0) {
                System.out.print("Çıkış yaptınız.\n");
                break;
            }
            switch (select){
                case 1:
                    System.out.println("Toplama işlemi için 2 sayı girin.");
                    break;
                case 2:
                    System.out.println("Çıkarma işlemi için 2 sayı girin.");
                    break;
                case 3:
                    System.out.println("Çarpma işlemi için 2 sayı girin.");
                    break;
                case 4:
                    System.out.println("Bölme işlemi için 2 sayı girin.");
                    break;
                case 5:
                    System.out.println("Üs alma işlemi için 2 sayı girin.");
                    break;
                case 6:
                    System.out.println("Mod alma işlemi için 2 sayı girin.");
                case 7:
                    System.out.println("Dikdörtgenin alan ve çevresini hesaplamak için kısa ve uzun kenarı (cm) cinsinden girin");
                    break;
            }
            System.out.print("İlk sayı : ");
            int a = scanner.nextInt();
            System.out.print("İkinci sayı : ");
            int b = scanner.nextInt();
            switch (select) {
                case 1:
                    topla(a, b);
                    break;
                case 2:
                    cikar(a,b);
                    break;
                case 3:
                    carp(a,b);
                    break;
                case 4:
                    bolme(a,b);
                    break;
                case 5:
                    us(a,b);
                    break;
                case 6:
                    mod(a,b);
                    break;
                case 7:
                    dikdortgen(a,b);
                    break;
                default:
                    System.out.print("Geçersiz seçenek.");

            }
        }
    }


}
