import java.util.Scanner;

public class CSE110MidTermPracticeSetLoop_Problem9 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter number: ");
        int num = sc.nextInt();
        int sum = 0;

        while (true) {
            if (num == 0) {
                break;
            }
            sum += (num % 10);
            num /= 10;
        }
        if (sum % 2 == 0) {
            System.out.println("The sum is Even");
        } else if (sum % 2 != 0) {
            System.out.println("The sum is Odd");
        }

    }
}