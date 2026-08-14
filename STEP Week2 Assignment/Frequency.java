//Stop-Word-Filtered Word Frequency Report
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

class WordFrequency {

    void printFilteredWordFrequency(String feedback) {

        feedback = feedback.toLowerCase();
        feedback = feedback.replace(".", "");
        feedback = feedback.replace(",", "");

        String[] words = feedback.split("\\s+");

        String[] stopWords = {"the", "was", "and", "a", "is", "of", "in"};

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < words.length; i++) {

            boolean stop = false;

            for (int j = 0; j < stopWords.length; j++) {
                if (words[i].equals(stopWords[j])) {
                    stop = true;
                    break;
                }
            }

            if (!stop) {
                if (map.containsKey(words[i])) {
                    map.put(words[i], map.get(words[i]) + 1);
                } else {
                    map.put(words[i], 1);
                }
            }
        }

        while (!map.isEmpty()) {

            String maxWord = "";
            int maxCount = 0;

            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue() > maxCount) {
                    maxWord = entry.getKey();
                    maxCount = entry.getValue();
                }
            }

            System.out.println(maxWord + ": " + maxCount);

            map.remove(maxWord);
        }
    }
}

public class Frequency{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter feedback:");
        String feedback = sc.nextLine();

        WordFrequency w = new WordFrequency();

        w.printFilteredWordFrequency(feedback);
    }
}