package Loops;

import java.util.Scanner;

public class CombinationCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin : ");
        int n = scanner.nextInt();
        System.out.print("İkinci sayıyı girin : ");
        int r = scanner.nextInt();
        int totalN =1;
        int totalR =1;
        int nEksiR = n-r;
        int totalReksiN =1;
        for(int i=1; i<=n;i++){
            totalN= totalN * i;
        }
        for (int i = 1; i <=r; i++){
            totalR = totalR * i;
        }
        for(int i = 1; i <=nEksiR; i++){
            totalReksiN = totalReksiN *i;
        }

    double formul = totalN / (totalR *(totalReksiN));
        System.out.println("N'nin R'li kombinasyonu : "+formul);
    }
}

/*N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı
grupların sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu
 C(n,r) şeklinde gösterilir.

Java ile kombinasyon hesaplayan program yazınız.

Kombinasyon formülü
C(n,r) = n! / (r! * (n-r)!) */