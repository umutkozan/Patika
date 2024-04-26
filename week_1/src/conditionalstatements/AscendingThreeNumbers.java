package conditionalstatements;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class AscendingThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + ". sayıyı giriniz: ");
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);

        if (numbers[0] == numbers[1] && numbers[1] == numbers[2]) {
            System.out.println("Sayılar birbirine eşittir: " + numbers[0] + " = " + numbers[1] + " = " + numbers[2]);
        } else {
            System.out.println("Sayıların küçükten büyüğe sırası: " + numbers[0] + " < " + numbers[1] + " < " + numbers[2]);
        }
    }
}

