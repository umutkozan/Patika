package conditionalstatements;

import java.util.Scanner;

public class branchbirlestirmedenemeleri {

        public static void main(String[] args) {
            //Değişken yaratımı:
            Scanner scanner = new Scanner(System.in);
            double ortaFiyat = 0, yasIndirimi, sonFiyat;

            //Kullanıcı girişleri
            System.out.println("Mesafeyi km cinsinden giriniz:");
            double mesafe = scanner.nextDouble();
            //Negatif sayı kontrolü:
            if (mesafe <= 0) {
                System.out.println("Mesafe negatif veya 0 olamaz! Tekrar deneyin.");
                System.exit(0);
            }

            System.out.println("Yaşınızı giriniz:");
            double yas = scanner.nextDouble();
            //Negatif sayı kontrolü:
            if (yas < 0) {
                System.out.println("Yaş negatif olamaz! Tekrar deneyin.");
                System.exit(0);
            }

            System.out.println("Yolculuk tipini seçiniz: ( 1 => Tek Yön, 2 => Çift Yön )");
            int tip = scanner.nextInt();
        }
}
