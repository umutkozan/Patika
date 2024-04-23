package kdv;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


       String[] urunTuru= {"Gıda","gida","Saglik","Saglık","Sağlık","saglik","Ulasim","Ulaşım"};
       double tutar;
       Scanner input = new Scanner(System.in);
       System.out.println("Tutarı girin : ");
       tutar = input.nextDouble();
       System.out.println("Hizmet ya da ürün türünü girin :");
       String girilenTur = input.next();
       boolean urunBulundu = false;
       for(int i =0; i<urunTuru.length; i++) {
           if (girilenTur.equalsIgnoreCase(urunTuru[i])) {
               double kdvOrani = 0.0;
               if (urunTuru[i].equals("Gıda")) {
                   kdvOrani = 10;
               } else if (urunTuru[i] == "Saglik") {
                   kdvOrani = 8;
               } else if (urunTuru[i] == "Ulasim") {
                   kdvOrani = 20;
               }
               double kdvHesapla = tutar + tutar * kdvOrani / 100;
               System.out.println(urunTuru[i] + " ürün türündeki harcamanın  kdv oranı %" +kdvOrani + " Ürünün kdv'siz fiyatı : " + tutar + ". Hizmetin kdv dahil fiyatı : " + kdvHesapla);
               urunBulundu = true;
               break;
           }
       }
            if (!urunBulundu){
                System.out.println("Girdiğiniz ürün türü tanımlı değil!");
            }


    }


  }
