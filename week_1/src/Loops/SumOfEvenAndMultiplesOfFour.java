package Loops;

import java.util.Scanner;

public class SumOfEvenAndMultiplesOfFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi;
        int  toplam = 0;
        do {
            System.out.print("Bir sayı giriniz : ");
           sayi = scanner.nextInt();
           if(sayi %2==0 && sayi % 4 ==0){
                  toplam += sayi;
            }
           //sayı / 2 = 0 olduğu sürece döngüye devam etmesini istedik.
        } while (sayi % 2 ==0);
        System.out.println("Toplam : " + toplam);
    }
}
/*Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri
 kabul eden ve girilen değerlerden çift
ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.   */