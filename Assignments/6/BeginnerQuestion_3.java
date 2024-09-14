import java.util.Scanner;

public class BeginnerQuestion_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the Sentence: ");
        String str = sc.nextLine();

        System.out.printf("Enter Splitting Character: ");
        String split = sc.next();

        char splitChar = split.charAt(0);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == splitChar) {
                System.out.println();
            } else {
                System.out.print(str.charAt(i));

            }
        }
    }

}