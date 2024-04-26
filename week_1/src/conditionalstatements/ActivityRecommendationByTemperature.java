package conditionalstatements;

import java.util.Scanner;

public class ActivityRecommendationByTemperature {
    public static void main(String[] args) {
             /*etkinlikler adında bir dizi oluşturduk. böylece yeni etkinlik eklemek istediğimiz
              zaman etkinlikler dizisine ekleyerek 50 farklı yerde direkt kullanabiliriz.
               her satıra etkinlik ismi yazarak ilerlersek aynı etkinlik ismini 50 farklı yerde
               tek tek elle girmemiz gerekir. */
             String[] etkinlikler = {"Kayak","Sinema","Piknik","Yüzme"};
             Scanner sicaklik = new Scanner(System.in);
             System.out.print("Hava kaç derece ? : ");
             int hava = sicaklik.nextInt();
             //hava degerlerini if else ile sınırlıyoruz.
             if(hava < 5){
                 //etklinlikler dizisinin [0]'ıncı elemanı Kayak [3]'üncü elemanı Yüzme
                 System.out.println("Sicaklık : " + hava + " önerilen etkinlik : " + etkinlikler[0]);
             }else if(hava>5 && hava <=15){
                 System.out.println("Sicaklık : " + hava + " önerilen etkinlik : " + etkinlikler[1]);
             }else if(hava>15 && hava <= 25) {
                 System.out.println("Sicaklık : " + hava + " önerilen etkinlik : " + etkinlikler[2]);
             }else{
                 System.out.println("Sicaklık : " + hava + " önerilen etkinlik : " + etkinlikler[3]);
             }
    }
}

/*Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
Ödev
Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.*/