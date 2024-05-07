package Teknik_4;

public class ElemanFrekans {
    public static void main(String[] args) {
        int[] array = {10, 20, 20, 10, 10, 20, 5, 20};
        boolean[] visited = new boolean[array.length];

        System.out.println("Tekrar Sayıları:");
        for (int i = 0; i < array.length; i++) {
            if (!visited[i]) {
                int count = 1;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        visited[j] = true;
                        count++;
                    }
                }
                System.out.println(array[i] + " sayısı " + count + " kere tekrar edildi.");
            }
        }
    }
}

