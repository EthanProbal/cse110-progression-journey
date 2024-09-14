import java.util.Scanner;

public class BeginnerQuestion_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter your favourite word: ");
        String str1 = sc.nextLine();
        String str2 = str1;

        boolean isPalindrome = true;
        int strLn = str1.length();

        for (int i = 0; i < strLn; i++) {
            int str1CharsVal = (int) str1.charAt(i);
            int str2CharsVal = (int) str2.charAt(strLn - 1 - i);

            if (str1CharsVal != str2CharsVal) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Palindrome: " + isPalindrome);
    }

}