package Methods;

import java.util.Scanner;

public class AsalMi {
    static boolean asalMi(int sayi, int kontrol) {
        // Sayı 2'den küçükse asal değildir
        if (sayi < 2)
            return false;

        // Eğer kontrol sayı sayıya eşitse, sayı asaldır
        if (sayi == kontrol)
            return true;

        // Eğer sayı kontrol sayısına tam bölünüyorsa, asal değildir
        if (sayi % kontrol == 0)
            return false;

        // Recursive olarak kontrol sayısını artırarak devam et
        return asalMi(sayi, kontrol + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        if (asalMi(sayi, 2))
            System.out.println(sayi + " bir asal sayıdır.");
        else
            System.out.println(sayi + " bir asal sayı değildir.");

        scanner.close();
    }
}

