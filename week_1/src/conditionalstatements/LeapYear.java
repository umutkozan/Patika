package conditionalstatements;
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        // Kullanıcıdan yılı al
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yıl Giriniz: ");
        int year = scanner.nextInt();
        scanner.close();

        // Artık yıl kontrolü yap
        boolean isLeapYear = checkLeapYear(year);

        // Sonucu ekrana yazdır
        if (isLeapYear) {
            System.out.println(year + " bir artık yıldır !");
        } else {
            System.out.println(year + " bir artık yıl değildir !");
        }
    }

    // Artık yıl kontrolünü yapan fonksiyon
    public static boolean checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
