import java.io.*;
import java.util.Scanner;

public class SimpleNotePad {

    private static final String FILE_PATH = "C:\\Users\\user\\Desktop\\patika\\camp\\Notepadd\\src\\notlar.txt"; // Dosya yolu

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Önceki metni dosyadan oku ve ekrana yazdır
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_PATH))) {
            String okunanMetin;
            System.out.println("Önceki metin:");
            while ((okunanMetin = bufferedReader.readLine()) != null) {
                System.out.println(okunanMetin);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı, yeni bir dosya oluşturulacak.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Kullanıcıdan yeni metin girişi al
        System.out.print("Bir metin girin: ");
        String metin = scanner.nextLine();

        // Metni dosyaya yaz
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(FILE_PATH))) {
            printWriter.print(metin);
        } catch (IOException e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}

