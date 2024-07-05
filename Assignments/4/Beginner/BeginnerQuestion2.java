import java.util.Scanner;

public class BeginnerQuestion2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("How many numbers?: ");
        int N = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= N; i++) {
            sum += sc.nextInt();
        }

        float avg = (float) sum / (float) N;

        System.out.printf("The sum of %d no is: %d\n", N, sum);
        System.out.printf("The Average is: %f\n", avg);

    }
}