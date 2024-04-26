package variables;

import java.util.Scanner;

public class CemberAlanCevre {
    public static void main(String[] args) {
        Scanner gir = new Scanner(System.in);
        System.out.print("Yariçap bilgisini giriniz :");
        double yariCap = gir.nextInt();
        double pi = 3.14;
        double alan = pi * yariCap * yariCap;
        System.out.print(" Dairenin alanı : "+alan);
        double cevre = 2 * pi * yariCap;
        System.out.println(" Dairenin çevresi : " +cevre);
    }
}
