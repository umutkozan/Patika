import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SumNumbersFromFile {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\user\\Desktop\\patika\\camp\\week_6\\src\\numbers.txt"; // Dosya yolu
        int sum = 0;

        // Dosya okuma işlemini try-with-resources bloğu içinde gerçekleştiriyoruz
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Dosyayı satır satır okuyup, her satırı tam sayıya dönüştürüyoruz
            while ((line = br.readLine()) != null) {
                int number = Integer.parseInt(line);
                sum += number; // Sayıyı toplam değişkenine ekliyoruz
            }
        } catch (IOException e) {
            e.printStackTrace(); // Dosya okuma sırasında oluşabilecek hataları yakalayıp yazdırıyoruz
        }

        // Toplam sonucu ekrana yazdırıyoruz
        System.out.println("Toplam: " + sum);
    }
}