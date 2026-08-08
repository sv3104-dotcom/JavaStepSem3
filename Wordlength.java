//Movie Review Word Length Profiler
public class Wordlength {
    public static void main(String[] args) {

        String review = "This movie was absolutely fantastic and thrilling";

        String[] words = review.split(" ");

        int shortWord = 0, mediumWord = 0, longWord = 0;

        for (String word : words) {
            int len = word.length();

            if (len >= 1 && len <= 4)
                shortWord++;
            else if (len >= 5 && len <= 8)
                mediumWord++;
            else
                longWord++;
        }

        System.out.println("Short: " + shortWord);
        System.out.println("Medium: " + mediumWord);
        System.out.println("Long: " + longWord);
    }
}