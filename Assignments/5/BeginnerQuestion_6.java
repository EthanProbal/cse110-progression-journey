import java.util.Scanner;

public class BeginnerQuestion_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("How many Lines?: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= (num - i); j++) {
                System.out.printf(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }

    }

}