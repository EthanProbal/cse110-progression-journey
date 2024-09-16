import java.util.Scanner;

public class BeginnerQuestion_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter String: ");

        StringBuilder str1 = new StringBuilder(sc.nextLine());

        int charInd = 0;

        for (int i = 0; i < str1.length(); i++) {
            int asciiVal = (int) str1.charAt(i);
            boolean con1 = asciiVal >= 65 && asciiVal <= 90 || asciiVal >= 97 && asciiVal <= 122;

            if (con1) {
                if (charInd % 2 == 0) {
                    str1.replace(i, i + 1, (str1.charAt(i) + "").toLowerCase());
                    charInd++;
                } else if (charInd % 2 != 0) {
                    str1.replace(i, i + 1, (str1.charAt(i) + "").toUpperCase());
                    charInd++;

                }
            }
        }

        System.out.println(str1);

    }

}