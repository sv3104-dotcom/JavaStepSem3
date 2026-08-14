//Word Reversal Encoder
import java.util.Scanner;

class WordEncoder {
    String reverseEachWord(String sentence) {
        String[] words = sentence.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            StringBuilder sb = new StringBuilder(words[i]);
            sb.reverse();

            result = result + sb;

            if (i < words.length - 1) {
                result = result + " ";
            }
        }

        return result;
    }
}

public class Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();

        WordEncoder w = new WordEncoder();  //Object creation

        System.out.println(w.reverseEachWord(sentence));
    }
}