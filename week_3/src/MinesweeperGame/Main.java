package MinesweeperGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int rows,cols;
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Mayın tarlasına hoşgeldiniz.!");
        System.out.println("Lütfen oynamak istediğiniz boyutları seçin. !");
        System.out.print("Satır sayısı : ");
        rows = scanner.nextInt();
        System.out.print("Sütun sayısı : ");
        cols = scanner.nextInt();
        MineSweeper game = new MineSweeper(rows,cols);

    }
}
