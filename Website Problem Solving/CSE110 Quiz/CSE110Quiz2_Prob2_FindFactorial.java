import java.util.Scanner;

public class CSE110Quiz2_Prob2_FindFactorial {

    // Find the Factorial

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter number: ");
        int num = sc.nextInt();

        int result = 1;

        for (int i = num; i >= 1; i--) {
            result = (result * i);
        }

        System.out.println(result);

    }
}