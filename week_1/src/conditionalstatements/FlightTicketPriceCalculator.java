package conditionalstatements;

import java.util.Scanner;

public class FlightTicketPriceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double kmPrice = 0.10;

        System.out.print("Yaşınızı girin: ");
        int years = scanner.nextInt();

        System.out.print("Mesafeyi km cinsinden giriniz: ");
        double km = scanner.nextDouble();

        System.out.print("Yolculuk tipini girin.\n1 => Tek Yön\n2 => Gidiş-Dönüş\n");
        int travellerTips = scanner.nextInt();

        if (km < 0 || years < 0 || travellerTips < 1 || travellerTips > 2) {
            System.out.println("Hatalı Veri Girdiniz !");
        } else {
            double totalPrice = km * kmPrice;

            if (travellerTips == 2) {
                totalPrice *= 0.8; // %20 indirim
                if (years < 12) {
                    totalPrice *= 0.5; // %50 indirim
                } else if (years < 25) {
                    totalPrice *= 0.9; // %10 indirim
                } else if (years > 65) {
                    totalPrice *= 0.7; // %30 indirim
                }
                System.out.println("İndirimli Bilet fiyatı: " + totalPrice);

            } else if (travellerTips == 1) {
                if (years < 12) {
                    totalPrice *= 0.5; // %50 indirim
                } else if (years < 25) {
                    totalPrice *= 0.9; // %10 indirim
                } else if (years > 65) {
                    totalPrice *= 0.7; // %30 indirim
                }
                System.out.println("Bilet fiyatı: " + totalPrice);

            }

        }
    }
}

//mesafe ve şartlara göre fiyat hesaplanacak.
//kullanıcıdan km alınacak. yaşı ve yolculuk tipi(tek-yon-gidis donus) alınacak.
//mesafe başına ücret 0.10tl / km olarak alın.
//ilk olarak uçuşun toplam fiyatı hesaplayın ve bazı koşullara göre indirimler uygula
/*Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı,
yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !"
şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.*/