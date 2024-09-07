import java.util.Scanner;

public class BeginnerQuestion_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("How many Primes to Find?: ");
        int primeToCount = sc.nextInt();
        int num = 2;
        int primeFound = 0;

        while (true) {
            if (primeFound == primeToCount) {
                break;
            }

            int divisorCount = 0;

            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    divisorCount++;
                }
            }

            if (divisorCount == 2) {
                System.out.println(num);
                primeFound++;
            }
            num++;
        }
    }

}