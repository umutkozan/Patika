package conditionalstatements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GradeCalculations {
    public static void main(String[] args) {
        //dersleri ders dizisi içerisinde tanımladık.
        String[] ders = {"matematik", "fizik", "turkce", "kimya", "muzik"};
        //gireceğimiz not sayısını notlar[] dizisiyle belirttik ve notlar dizisi tanımladık
        double[] notlar = new double[5];
        //notların toplamını biriktireceğimiz degiskeni tanımladık
        double toplam = 0;
        //0-100 aralıgına uyan gecerlinotların sayılarını tutacagımız degiskeni tanımladık
        int gecerliNotSayisi = 0;
        //klavyeden sayı girmek üzere scanner sınıfını çagırdık
        Scanner scanner = new Scanner(System.in);
        //for döngüsüyle her bir i'inci degeri notlar dizisinin uzunluğu bitesiye kadar arttırdık.
        for (int i = 0; i < notlar.length; i++) {
            //i sayısı her arttığında for döngüsü içerisindeki kodlar 1 tur çalışacak.
            //ders[i] sırayla 0,1,2,3,4 sayılarına yükselecek
            System.out.print(ders[i] + " notunu gir :");
            double not = scanner.nextDouble();
            if (not >= 0 && not <= 100) {
                notlar[i] = not;
                toplam +=not;
                gecerliNotSayisi++;
            }else {
                System.out.println(not + " <- 0-100 aralığında değil. Ortalamaya dahil edilmeyecek.");
            }
        }
        double ortalama = toplam /gecerliNotSayisi;
        System.out.println("Ortalama : " + ortalama);
        scanner.close();

    }
}