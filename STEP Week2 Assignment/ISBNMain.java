//Library ISBN Normalizer & Validator
import java.util.Scanner;

class ISBNValidator {

    String normalizeCode(String raw) {
        raw = raw.trim();

        String first = raw.substring(0, 3).toUpperCase();
        String rest = raw.substring(3);

        return first + rest;
    }

    String validateAndFormat(String code) {

        if (code.length() != 13) {
            return "Invalid: wrong length";
        }

        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(code.charAt(i))) {
                return "Invalid: publisher code must be 3 letters";
            }
        }

        for (int i = 3; i < 13; i++) {
            if (!Character.isDigit(code.charAt(i))) {
                return "Invalid: body must contain digits";
            }
        }

        StringBuilder sb = new StringBuilder();

        sb.append("[");
        sb.append(code.substring(0, 3));
        sb.append("] YEAR: ");
        sb.append(code.substring(3, 7));
        sb.append(" | CATALOG: ");
        sb.append(code.substring(7));

        return sb.toString();
    }
}

public class ISBNMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ISBN code: ");
        String raw = sc.nextLine();

        ISBNValidator obj = new ISBNValidator();

        String code = obj.normalizeCode(raw);
        String result = obj.validateAndFormat(code);

        System.out.println(result);
    }
}