package Teknik_4;

public class Harmonik {
    public static void main(String[] args) {
        int[] numaralar = {93,10,1,5,44,11,12};
        double toplam = 0.0;
        for(int i=0; i<numaralar.length; i++){
            toplam = toplam +  (double) 1 / numaralar[i];
        }
        double ortalama = numaralar.length / toplam;
        System.out.println("Harmonik ortalama : "+ortalama);
    }
}
