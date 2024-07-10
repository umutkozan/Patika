import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SumNumbersFromFile {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\user\\Desktop\\patika\\camp\\week_6\\src\\numbers.txt"; // Dosya yolu
        int sum = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                int number = Integer.parseInt(line); // Satırı tam sayıya dönüştür
                sum += number; // Sayıyı toplama ekle
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Toplam: " + sum); // Sonucu ekrana yazdır
    }
}
