package Teknik_4;

import java.util.Scanner;

public class Transpoz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Matrisin boyutlarını kullanıcıdan al
        System.out.print("Matrisin satır sayısını giriniz: ");
        int rows = scanner.nextInt();
        System.out.print("Matrisin sütun sayısını giriniz: ");
        int columns = scanner.nextInt();

        // Matrisi oluştur
        int[][] matrix = new int[rows][columns];

        // Kullanıcıdan matrisin elemanlarını al
        System.out.println("Matrisin elemanlarını giriniz:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Matris[" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Matrisin transpozunu al
        int[][] transpose = new int[columns][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Matrisi ve transpozunu yazdır
        System.out.println("Matris:");
        printMatrix(matrix);
        System.out.println("Transpoz:");
        printMatrix(transpose);
    }

    // Matrisi yazdırmak için yardımcı bir metod
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    }
