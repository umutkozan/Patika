import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostFrequentWordFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir metin girin:");
        String inputText = scanner.nextLine();

        // Kelimeleri saymak için HashMap kullanıyoruz
        HashMap<String, Integer> wordCounts = new HashMap<>();

        // Metni kelimelere ayırmak için split metodunu kullanıyoruz
        String[] words = inputText.split("\\s+");

        // Kelimeleri sayıyoruz
        for (String word : words) {
            word = word.toLowerCase(); // Büyük/küçük harf duyarlılığını kaldırmak için küçük harfe çeviriyoruz
            if (wordCounts.containsKey(word)) {
                wordCounts.put(word, wordCounts.get(word) + 1);
            } else {
                wordCounts.put(word, 1);
            }
        }

        // En çok geçen kelimeyi buluyoruz
        String mostFrequentWord = null;
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequentWord = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        if (mostFrequentWord != null) {
            System.out.println("En çok geçen kelime: " + mostFrequentWord);
            System.out.println("Geçiş sayısı: " + maxCount);
        } else {
            System.out.println("Metinde kelime bulunamadı.");
        }

        scanner.close();
    }
}

