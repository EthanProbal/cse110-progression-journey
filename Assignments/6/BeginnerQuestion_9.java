import java.util.Scanner;

public class BeginnerQuestion_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the String: ");
        String str = sc.nextLine();

        boolean strong;

        boolean eightCharLong = false;
        boolean oneUpperCase = false;
        boolean oneLowerCase = false;
        boolean hasDigits = false;
        boolean hasSpecialChars = false;

        for (int i = 0; i < str.length(); i++) {
            if (str.length() >= 8) {
                eightCharLong = true;
            }
            if ((int) str.charAt(i) >= 65 && (int) str.charAt(i) <= 90) {
                oneUpperCase = true;
            }
            if ((int) str.charAt(i) >= 97 && (int) str.charAt(i) <= 122) {
                oneLowerCase = true;
            }
            if ((int) str.charAt(i) >= 48 && (int) str.charAt(i) <= 57) {
                hasDigits = true;
            }
            if (str.charAt(i) == '!' || str.charAt(i) == '@' || str.charAt(i) == '#' || str.charAt(i) == '$'
                    || str.charAt(i) == '%' || str.charAt(i) == '&') {
                hasSpecialChars = true;
            }
        }

        strong = (eightCharLong && oneLowerCase && oneUpperCase && hasDigits && hasSpecialChars);
        System.out.println(strong);

    }

}