package Loops;
import java.util.Scanner;


public class EbobEkok {
    public static void main(String[] args) {
        {
                Scanner input = new Scanner(System.in);

                System.out.print("İlk sayıyı giriniz: ");
                int num1 = input.nextInt();
                System.out.print("İkinci sayıyı giriniz: ");
                int num2 = input.nextInt();

                int ebob = 1;
                int ekok = 1;
                int i = 1;

                while (i <= num1 && i <= num2) {
                    if (num1 % i == 0 && num2 % i == 0) {
                        ebob = i;
                    }
                    i++;
                }

                ekok = (num1 * num2) / ebob;

                System.out.println("Girilen sayıların EBOB değeri: " + ebob);
                System.out.println("Girilen sayıların EKOK değeri: " + ekok);
            }
        }
    }
