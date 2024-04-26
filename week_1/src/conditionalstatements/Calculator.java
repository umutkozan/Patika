package conditionalstatements;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double sayi1, sayi2;
        char secenek;
        Scanner sec = new Scanner(System.in);
        System.out.print("İlk sayiyi gir : ");
        sayi1 = sec.nextDouble();

        // Girintiyi temizlemek için
        sec.nextLine();

        System.out.print("İkinci sayiyi gir : ");
        sayi2 = sec.nextDouble();
        System.out.print("1-Toplam\n2-Cikarma\n3-Bölme\n4-Carpma\n");
        System.out.println("Hangi işlemi yaptırmak istiyorsunuz ? ");
        secenek = sec.next().charAt(0);
        double sonuc = 0;
        switch (secenek) {
            case '1':
                sonuc = sayi1 + sayi2;
                break;
            case '2':
                sonuc = sayi1 - sayi2;
                break;
            case '3':
                if (sayi2 != 0) {
                    sonuc = sayi1 / sayi2;
                } else {
                    System.out.println("Sıfıra bölme hatası!");
                    return;
                }
                break;
            case '4':
                sonuc = sayi1 * sayi2;
                break;
            default:
                System.out.println("Hatalı Giriş yaptınız");
        }
        System.out.println("Sonuç: " + sonuc);
    }

}
