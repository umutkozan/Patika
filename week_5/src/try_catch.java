import java.lang.module.FindException;
import java.util.Scanner;

class TryCatchExample {
    int[] dizi = {5, 23, 2, 1, 5, 7, 3, 32, 1, 2};
    Scanner scan = new Scanner(System.in);

    public void accessArrayElement() {
        try {
            System.out.print("Kaçıncı sıradaki elemanı istiyorsunuz: ");
            int index = scan.nextInt(); // Kullanıcının girdiği değeri index olarak ata

            // Dizinin bu indexteki elemanını yazdır
            System.out.println("dizi[" + index + "] = " + dizi[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dizi 10 elemanlı, siz dizi sınırları dışında eleman arıyorsunuz");
            System.out.println("Beklenmedik bir hata oluştu: " + e.getMessage());

        }
    }
    public static void main(String[] args) {
        TryCatchExample example = new TryCatchExample();
        example.accessArrayElement();
    }
}
