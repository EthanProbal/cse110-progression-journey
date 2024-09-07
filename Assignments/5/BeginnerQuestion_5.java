import java.util.Scanner;

public class BeginnerQuestion_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter Width: ");
        int width = sc.nextInt();

        System.out.printf("Enter Length: ");
        int length = sc.nextInt();

        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.printf("%d ", j);
            }
            System.out.println();
        }
    }

}