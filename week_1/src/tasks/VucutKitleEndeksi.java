package tasks;

import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {
        Scanner gir = new Scanner(System.in);
        //scanner sınıfı kullanarak kullanıcıdan veri girmesini sağlıyoruz.
        System.out.print("Boyunuzu giriniz : ");
        double boy = gir.nextDouble();
        // kullanıcının girdiği cm cinsinden boy bilgisini arkaplanda 100'e bölerek metre cinsine çeviriyoruz
        double boyMetre = boy /100;
        System.out.print("Kilonuzu giriniz : ");
        double kilo = gir.nextDouble();
        //vücut kitle endeksi formülünü vucutKitle değişkeninde tanımlıyoruz.
        double vucutKitle =( kilo / (boyMetre*boyMetre));
        //yazdır
        System.out.print("Vücut kitle endeksiniz :" + vucutKitle);
    }
}
