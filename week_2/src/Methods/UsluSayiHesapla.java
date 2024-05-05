package Methods;

import java.util.Scanner;

public class UsluSayiHesapla {
               public static int usluHesapla(int taban, int us){
                   if(us==0){
                       return 1;
                   }else {
                       return  taban * usluHesapla(taban,us-1);
                   }
               }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tabanı giriniz : ");
          int taban= scanner.nextInt();
        System.out.print("Üssü giriniz : ");
          int us = scanner.nextInt();
          int sonuc = usluHesapla(taban,us);
        System.out.print(taban + "^" + us + " = "+ sonuc);

    }
}
