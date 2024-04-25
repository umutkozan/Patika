package tasks;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
       double acilis = 10;
      Scanner kmGir = new Scanner(System.in);
        System.out.print("Km Gir : ");
        double km = kmGir.nextInt();
        double ucret = acilis + (km * 2.20);
        if (ucret <20){
            ucret = 20;
            System.out.println("Ucret :" +ucret);
        } else {
            System.out.println("Ucret :" +ucret);

        }
    }

}
