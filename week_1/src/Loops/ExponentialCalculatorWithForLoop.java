package Loops;

import java.util.Scanner;

public class ExponentialCalculatorWithForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı girin : ");
        int taban= scanner.nextInt();
        System.out.print("Üssü girin : ");
        int toplam=1;
        int us = scanner.nextInt();
       for(int i =1; i<=us;){
           toplam *=taban;
           i++;
       }
        System.out.println("Toplam : "+toplam);
    }
}

/*Java ile kullanıcının girdiği değerler ile üslü
sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.

 */