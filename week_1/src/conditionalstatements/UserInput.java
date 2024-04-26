package conditionalstatements;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        //Kullanıcı adı ve şifrede kullanılacak sayılar
        //dört işlem için kullanılmayacak bu yüzden String tanımlayabiliriz.
        String kullaniciAdi, kullaniciSifre;
        Scanner kullaniciBilgileri = new Scanner(System.in);
        //Scanner sınıfı ile kullanıcıBilgileri nesnesini kullanarak kullanıcı bilgilerini alıyoruz.
        System.out.print("Kullanıcı adı girin :");
        kullaniciAdi =  kullaniciBilgileri.nextLine();
        System.out.print("Kullanıcı şifresi girin :");
        kullaniciSifre = kullaniciBilgileri.nextLine();
        //kullanıcı adı ve sifre umut ve 12345 ' e eşit ise giriş yaptınız mesajı veriyoruz
         if (kullaniciAdi.equals("umut") && kullaniciSifre.equals("12345")){
            System.out.print("Giris yaptiniz " + kullaniciAdi);
        // kullanıcı sifresi 12345 ' e eşit değilse hatalı giriş yaptınız  mesajı veriyoruz
        }else if(kullaniciSifre != "12345"){
             System.out.print("Hatalı giriş yaptınız. Şifrenizi Degistirmek ister misiniz ?");
          //yesno değişkeni tanımlayarak kullanıcıya şifre yenileme sorusu soruyoruz.
             String yesno =  kullaniciBilgileri.nextLine();
         //eğer şifre yenilensin mi? sorusuna "evet" metni girilirse yeni şifreyi belirtmesini istiyoruz
             if(yesno.equals("evet")){
                 System.out.print("Yeni Sifreyi Belirtiniz : ");
         //yeniSifre degiskenini klavyeden gelecek ilk metin ile eşleştiriyoruz.
                       String yeniSifre = kullaniciBilgileri.nextLine();
                 //
                 if(yeniSifre.equals("12345") || yeniSifre.equals(kullaniciSifre)){
                     System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                 }else {
                     System.out.print("Şifre oluşturuldu");
                     yeniSifre = kullaniciSifre;
                 }
        }
    }


    }
}
