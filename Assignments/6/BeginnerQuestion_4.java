import java.util.Scanner;

public class BeginnerQuestion_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter String: ");
        String str = sc.nextLine();

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }

}