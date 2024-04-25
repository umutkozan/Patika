package tasks;

import java.util.Scanner;

public class IslemOnceligi {
    public static void main(String[] args) {
        //Scanner klavyeden veri girmemiz için kullandığımız bir kütüphane
        Scanner sayiGir = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz : ");
        // a - b- c değişkenlerini integer türünde tanımladık
        // "sayıGir" Scanner sınıfından türettiğimiz bir obje. Objenin sonuna nokta koyarak scanner sınıfının sunduğu nextInt 
        //ozelliginden faydalanarak girilecek ilk integer degeri a olarak tanımladık
        int a = sayiGir.nextInt();
        System.out.println("İkinci sayıyı giriniz : ");
        int b = sayiGir.nextInt();
        System.out.println("Ucuncu sayıyı giriniz : ");
        int c = sayiGir.nextInt();
        // islem adındaki double değişkende makinemizin yapmasını istediğimiz formülü tanımladık.
        double islem = a + b * c - b;
        // Sonucu sout ile yazdırdık.
        System.out.println("Sayıların islem onceliğine gore sonucu : " + islem);
    }

}
