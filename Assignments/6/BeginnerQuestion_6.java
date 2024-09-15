import java.util.Scanner;

public class BeginnerQuestion_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the String: ");
        String myString = sc.nextLine();
        String[] words = myString.split(" ");

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }

}