import java.util.Scanner;

public class CSE110MidTermPracticeSetLoop_Problem8 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter number: ");
        int num = sc.nextInt();

        while (true) {
            if (num % 2 == 0 && num != 1) {
                System.out.printf("%d, ", num);
                num /= 2;
            }
            if (num % 2 != 0 && num != 1) {
                System.out.printf("%d, ", num);
                num = 3 * num + 1;
            }
            if (num == 1) {
                System.out.printf("%d ", num);
                break;
            }
        }

    }
}