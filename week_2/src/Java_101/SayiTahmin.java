package Java_101;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahmin {
    public static void main(String[] args) {
        Random rastgele = new Random(); // Rastgele sayı üretmek için Random sınıfından bir nesne oluşturulur.
        int hedefSayi = rastgele.nextInt(100); // 0 ile 99 arasında rastgele bir sayı oluşturulur.

        Scanner giris = new Scanner(System.in); // Kullanıcıdan giriş almak için Scanner sınıfından bir nesne oluşturulur.
        int dogruSayi = 0; // Doğru tahmin edilen sayıların sayısını tutar.
        int tahmin;
        int[] yanlis = new int[5]; // Yanlış tahmin edilen sayıların listesini tutar.
        boolean kazandi = false; // Kullanıcının oyunu kazanıp kazanmadığını belirten bayrak.
        boolean hataliTahmin = false; // Kullanıcının çok sayıda hatalı giriş yapması durumunda kontrol sağlar.

        System.out.println(hedefSayi); // Oyunun test edilmesi için hedef sayıyı ekrana yazdırır.
        while (dogruSayi < 5) { // Kullanıcıya 5 hakkı olduğu bildirilir ve doğru tahmin yapılıncaya kadar devam eder.
            System.out.print("Lütfen tahmininizi giriniz: ");
            tahmin = giris.nextInt(); // Kullanıcının tahminini alır.

            if (tahmin < 0 || tahmin > 99) { // Girilen sayının 0 ile 99 arasında olup olmadığını kontrol eder.
                System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
                if (hataliTahmin) { // Birden fazla hatalı giriş yapıldıysa kontrol eder.
                    dogruSayi++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hakkınız: " + (5 - dogruSayi));
                } else {
                    hataliTahmin = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue;
            }

            if (tahmin == hedefSayi) { // Kullanıcının tahmini doğruysa işlem yapar.
                System.out.println("Tebrikler, doğru tahmin! Tahmin ettiğiniz sayı: " + hedefSayi);
                kazandi = true;
                break;
            } else { // Kullanıcının tahmini yanlışsa işlem yapar.
                System.out.println("Hatalı bir sayı girdiniz!");
                if (tahmin > hedefSayi) {
                    System.out.println(tahmin + " sayısı, gizli sayıdan büyüktür.");
                } else {
                    System.out.println(tahmin + " sayısı, gizli sayıdan küçüktür.");
                }

                yanlis[dogruSayi++] = tahmin; // Yanlış tahmin edilen sayılar listeye eklenir.
                System.out.println("Kalan hakkınız: " + (5 - dogruSayi));
            }
        }

        if (!kazandi) { // Kullanıcı oyunu kazanamazsa işlem yapar.
            System.out.println("Kaybettiniz!");
            if (!hataliTahmin) { // Kullanıcı çok sayıda hatalı giriş yapmadıysa işlem yapar.
                System.out.println("Tahminleriniz: " + Arrays.toString(yanlis));
            }
        }
    }
}
