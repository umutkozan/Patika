package tasks;

import java.util.Scanner;

public class vucutKitleEndeksi {
    public static void main(String[] args) {
        Scanner gir = new Scanner(System.in);
        System.out.print("Boyunuzu giriniz : ");
        double boy = gir.nextDouble();
        double boyMetre = boy /100;
        System.out.print("Kilonuzu giriniz : ");
        double kilo = gir.nextDouble();
        double vucutKitle =( kilo / (boyMetre*boyMetre));
        System.out.print("Vücut kitle endeksiniz :" + vucutKitle);
    }
}
