package Boks;

import java.util.Random;

public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        // İlk dövüşçüyü belirleme
        Fighter firstAttacker = determineFirstAttacker();

        if (checkWeight()) {
            while (f1.health > 0 && f2.health > 0) {
                System.out.println("======== YENİ ROUND ===========");
                if (firstAttacker == f1) {
                    f2.health = f1.hit(f2);
                } else {
                    f1.health = f2.hit(f1);
                }
                if (isWin()) {
                    break;
                }
                printScore();
            }
        } else {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
        }
    }

    // İlk dövüşçüyü belirleme metodu
    private Fighter determineFirstAttacker() {
        Random random = new Random();
        int chance = random.nextInt(2); // 0 veya 1 değeri alacak
        return chance == 0 ? f1 : f2; // %50 olasılıkla f1 veya f2 döndürülür
    }

    // Diğer metotlar buraya gelecek

    public boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    public boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Maçı Kazanan : " + f2.name);
            return true;
        } else if (f2.health == 0){
            System.out.println("Maçı Kazanan : " + f2.name);
            return true;
        }

        return false;
    }


    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Kalan Can \t:" + f1.health);
        System.out.println(f2.name + " Kalan Can \t:" + f2.health);
    }
}