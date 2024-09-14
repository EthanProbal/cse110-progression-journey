import java.util.Scanner;

public class BeginnerQuestion_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("");
        String myString = "I am a good boy";

        for (int i = 0; i < myString.length(); i++) {
            int charAsciiVal = (int) myString.charAt(i);

            if (charAsciiVal >= 97 && charAsciiVal <= 122) {
                System.out.print((char) (charAsciiVal - 32));
            } else {
                System.out.print((char) charAsciiVal);
            }

        }

    }

}