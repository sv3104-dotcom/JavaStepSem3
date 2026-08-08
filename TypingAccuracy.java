//Typing Speed Accuracy
public class TypingAccuracy {
    public static void main(String[] args) {

        String original = "hello world";
        String typed = "hello worlt";

        int match = 0;
        int first = -1;

        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) == typed.charAt(i)) {
                match++;
            } else if (first == -1) {
                first = i + 1;
            }
        }

        double accuracy = (match * 100.0) / original.length();

        System.out.println("Matched: " + match + "/" + original.length());
        System.out.println("Accuracy: " + accuracy + "%");

        if (first == -1)
            System.out.println("No Mismatches");
        else
            System.out.println("First Mismatch at Position: " + first);
    }
}