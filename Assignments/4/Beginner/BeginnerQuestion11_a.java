import java.util.Scanner;

public class BeginnerQuestion11_a {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter number: ");
        int num = sc.nextInt();

        int divisors = 0;
        // int isPerfect = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisors++;
            }
        }

        if (divisors == 2)
            System.out.printf("Prime\n");
        else if (divisors > 2)
            System.out.printf("Not Prime\n");
    }
}