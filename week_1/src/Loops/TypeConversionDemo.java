package Loops;
import java.util.Scanner;
public class TypeConversionDemo {
    public static void main(String[] args) {
        // Kullanıcıdan tam sayı ve ondalıklı sayı girişi alınır
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir tam sayı girin: ");
        int integerInput = scanner.nextInt();
        System.out.print("Bir ondalıklı sayı girin: ");
        double doubleInput = scanner.nextDouble();

        // Tip dönüşümleri yapılır ve sonuçlar ekrana yazdırılır
        double convertedIntegerToDouble = (double) integerInput;
        int convertedDoubleToInteger = (int) doubleInput;

        System.out.println("Tam sayıyı ondalıklı sayıya dönüştürme sonucu: " + convertedIntegerToDouble);
        System.out.println("Ondalıklı sayıyı tam sayıya dönüştürme sonucu: " + convertedDoubleToInteger);
    }
}
