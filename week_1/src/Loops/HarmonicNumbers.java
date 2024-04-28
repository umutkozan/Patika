package Loops;

import java.util.Scanner;

public class HarmonicNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin : ");
        int sayi = scanner.nextInt();
        double toplam =1.0;
        System.out.print("Girilen sayı : "+ sayi+" Harmonik seri :");

        for(int i=1; i<=sayi; i++){
            System.out.print(" +1/"+i);
            toplam += (1.0/i);
        }
    }
}
// Java ile girilen sayının harmonik serisini bulan program yazacağız.
//   1+ 1/2 + 1/3 + 1/4 ....
//
//
// */