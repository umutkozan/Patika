package Methods;

import java.util.Scanner;

public class DesenMetot {
    static void islemYap(int sayi) {
        // Base case: Sayı negatif veya 0 ise işlemi sonlandır
        if (sayi <= 0) {
            System.out.println("Son değer: " + sayi);
            return;
        }

        // Sayıdan 5 çıkar ve sonucu yazdır
        int yeniSayi = sayi - 5;
        System.out.println("Çıkarma: " + yeniSayi);

        // Recursive olarak islemYap metodu çağrılır
        islemYap(yeniSayi);

        // Son değer negatif veya 0 olduğunda ekleme işlemi yapma
        if (yeniSayi <= 0)
            return;

        // Eğer sayı negatif veya 0 değilse, 5 ekleyin ve sonucu yazdırın
        yeniSayi += 5;
        System.out.println("Ekleme: " + yeniSayi);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        // Recursive metot çağrılır
        islemYap(sayi);

        scanner.close();
    }
}
