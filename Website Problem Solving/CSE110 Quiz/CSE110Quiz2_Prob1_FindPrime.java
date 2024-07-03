import java.util.Scanner;

public class CSE110Quiz2_Prob1_FindPrime {

    // Find the Prime

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter number: ");
        int num = sc.nextInt();

        int divisors = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisors++;
            }
        }

        if (divisors == 2) {
            System.out.println("Prime");
        } else if (divisors > 2) {
            System.out.println("Not Prime");
        }

    }
}