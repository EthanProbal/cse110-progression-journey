import java.util.Scanner;

public class BeginnerQuestion_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.printf("Enter Number: ");
            int num = sc.nextInt();
            int divisorCount = 0;

            if (num % 2 != 0) {
                break;
            }

            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    divisorCount++;
                }
            }
            System.out.printf("%d has %d divisors\n", num, divisorCount);

        }

    }

}