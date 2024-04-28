package Loops;
import java.util.Scanner;
public class FibonacciGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Fibonacci serisinin eleman sayısını giriniz: ");
        int n = input.nextInt();

        int first = 0, second = 1;
        System.out.println(n + " Elemanlı Fibonacci Serisi:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(first + " ");

            int sum = first + second;
            first = second;
            second = sum;
        }
    }
    }

