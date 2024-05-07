package Teknik_4;

public class TekrarEdenSayilar {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 3, 2, 9, 5,6,6, 2, 8, 7, 3,6, 4, 2};

        System.out.println("Tekrar eden çift sayılar:");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j] && numbers[i] % 2 == 0) {
                    System.out.println(numbers[i]);
                    break; // Aynı sayıyı tekrar tekrar yazdırmamak için bu döngüden çık
                }
            }
        }
    }

}
