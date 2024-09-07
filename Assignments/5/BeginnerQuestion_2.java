import java.util.Scanner;

public class BeginnerQuestion_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the Value of N: ");
        int num = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                sum += j;
            }
        }

        System.out.printf("The Value of y: %d\n", -sum);

    }

}