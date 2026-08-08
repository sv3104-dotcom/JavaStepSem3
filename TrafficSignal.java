//Traffic Signal Streak Analyzer
public class TrafficSignal {
    public static void main(String[] args) {

        String signal = "RRGGGYRR";

        int max = 1, count = 1;
        char color = signal.charAt(0);

        for (int i = 1; i < signal.length(); i++) {
            if (signal.charAt(i) == signal.charAt(i - 1)) {
                count++;
            } else {
                count = 1;
            }

            if (count > max) {
                max = count;
                color = signal.charAt(i);
            }
        }

        System.out.println("Longest Streak: " + color + " repeated " + max + " times");
    }
}