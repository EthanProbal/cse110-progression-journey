import java.util.Scanner;

public class RandomProb_1_Calculate_N_NxN_NxNxN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = 0;
        int multiplier = 1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i + 1; j++) {
                multiplier *= n;
            }

            sum += multiplier;
            multiplier = 1;
        }
        System.out.println(sum);
    }

}