package variables;

import java.util.Scanner;

public class HipotenusHesaplama {
    public static void main(String[] args) {
        int kenar1,kenar2;
        double kenar3;
        Scanner uzunluklar = new Scanner(System.in);
        System.out.println("Kenar 1'in uzunluğunu gir : ");
        kenar1 = uzunluklar.nextInt();
        System.out.println("Kenar 2'nin uzunluğunu gir : ");
        kenar2 = uzunluklar.nextInt();
        //math.sqrt()  karekök almak için kullanılır örneğin math.sqrt(25) = 5 gibi
        kenar3 = Math.sqrt((kenar1*kenar1) + (kenar2*kenar2));
        System.out.println("Hipotenus :" + kenar3);



    }
}

