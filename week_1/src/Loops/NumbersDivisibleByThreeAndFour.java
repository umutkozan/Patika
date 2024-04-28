package Loops;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class NumbersDivisibleByThreeAndFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int sayi = scanner.nextInt();
        int toplam=0;
        int bolunenSayilarinSayaci=0;
        for(int i=0; i<=sayi; i++){
            if(i%3==0 && i%4==0){
                toplam += i;
                bolunenSayilarinSayaci +=1;
            }else {
                continue;
            }
        }
        int ortalama = toplam / bolunenSayilarinSayaci;
        System.out.print("Girdiğiniz sayı : "+sayi +". Girdiğiniz sayıya kadar 3 ve 4'e tam" +
                " bölünen sayiların toplamı :"+ toplam + ". Adedi :" + bolunenSayilarinSayaci +
                ". Ortalaması : " +ortalama);
    }
}
