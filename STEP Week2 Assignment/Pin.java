//ATM Pin length Validator
import java.util.Scanner;

class PinValidator {
    void checkPinLength(String pin) {
        if (pin.length() != 4) {
            System.out.println("Invalid PIN - must be exactly 4 digits.");
        } else {
            System.out.println("PIN length OK.");
        }
    }
}

public class Pin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter PIN: ");
        String pin = sc.nextLine();

        PinValidator p = new PinValidator();
        p.checkPinLength(pin);
    }
}