import java.util.Scanner;

public class RandomProb_2_Calculate_N_NN_NNN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int term = 0;
        int sum = 0;

        for (int i = 0; i < 3; i++) {
            term = term * 10 + n; // 5 * 10 + 5 = 55
            sum += term;
            // term = term * 10 + n; // 55 * 10 + 5 = 550 + 5 = 5
        }
        System.out.println(sum);
    }

}