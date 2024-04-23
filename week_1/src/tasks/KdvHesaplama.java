package tasks;

import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        KdvHesaplama kdvHesaplama = new KdvHesaplama();
        kdvHesaplama.hesaplaKdv();
    }

    public void hesaplaKdv() {
        double tutar;
        Scanner input = new Scanner(System.in);
        System.out.println("Tutarı girin : ");
        tutar = input.nextDouble();
        double kdvOrani;
        double kdvliFiyat;
        double kdvTutari;
        if(tutar>0 && tutar <=1000){
            kdvOrani = 18;
            kdvliFiyat = tutar + tutar * kdvOrani / 100;
            kdvTutari = tutar * kdvOrani / 100;
            System.out.println("Fiyat : " +tutar + " Kdv Oranı :" + kdvOrani + " Kdv tutarı :"+kdvTutari +
                     " Kdv dahil fiyat :" +kdvliFiyat);
        } else if (tutar >1000){
            kdvOrani = 8;
            kdvTutari = tutar * kdvOrani / 100;
            kdvliFiyat = tutar + tutar * kdvOrani / 100;
            System.out.println(" Fiyat : " +tutar + " Kdv Oranı :" + kdvOrani + " Kdv tutarı :"+kdvTutari +
                    " Kdv dahil fiyat :" +kdvliFiyat);
        }





    }
}
