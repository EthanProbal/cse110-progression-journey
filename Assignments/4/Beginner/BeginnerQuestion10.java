import java.util.Scanner;

public class BeginnerQuestion10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter number: ");
        int num = sc.nextInt();
        String numLength = "" + num;

        int[] digit = new int[numLength.length()];
        int i = 0;

        while (true) {
            digit[i] = (num % 10);
            i++;
            num /= 10;

            if (num <= 0) {
                break;
            }
        }

        for (int j = digit.length - 1; j > 0; j--) {
            System.out.printf("%d, ", digit[j]);
        }
        System.out.printf("%d", digit[0]);
    }
}