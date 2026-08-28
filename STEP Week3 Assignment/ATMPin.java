//ATM Pin Entry System
import java.util.Scanner;

public class ATMPin {

    static void atmPinRetry(String correctPin, String[] attempts) {

        int attempt = 0;
        boolean success = false;

        while (attempt < 3 && success == false) {

            if (attempts[attempt].equals(correctPin)) {
                success = true;
                System.out.println("PIN accepted");
                break;
            } else {
                attempt++;
            }
        }

        if (success == false) {
            System.out.println("Card blocked — too many incorrect attempts");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter correct PIN: ");
        String correctPin = sc.next();

        String[] attempts = new String[3];

        System.out.println("Enter 3 PIN attempts:");

        for (int i = 0; i < 3; i++) {
            attempts[i] = sc.next();
        }

        atmPinRetry(correctPin, attempts);

        sc.close();
    }
}