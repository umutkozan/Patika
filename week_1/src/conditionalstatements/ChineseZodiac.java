package conditionalstatements;
import java.util.Scanner;
public class ChineseZodiac {
    public static void main(String[] args) {
        // Kullanıcıdan doğum yılını al
        Scanner scanner = new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz: ");
        int birthYear = scanner.nextInt();
        scanner.close();

        // Çin Zodyağı burcunu hesapla
        String zodiacSign = calculateChineseZodiac(birthYear);

        // Sonucu ekrana yazdır
        System.out.println("Çin Zodyağı Burcunuz: " + zodiacSign);
    }

    // Çin Zodyağı burcunu hesaplayan fonksiyon
    public static String calculateChineseZodiac(int year) {
        switch (year % 12) {
            case 0: return "Maymun";
            case 1: return "Horoz";
            case 2: return "Köpek";
            case 3: return "Domuz";
            case 4: return "Fare";
            case 5: return "Öküz";
            case 6: return "Kaplan";
            case 7: return "Tavşan";
            case 8: return "Ejderha";
            case 9: return "Yılan";
            case 10: return "At";
            case 11: return "Koyun";
            default: return "Hesaplanamadı";
        }
    }
}

