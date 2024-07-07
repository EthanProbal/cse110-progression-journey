import java.util.Scanner;

public class BeginnerQuestion11_a {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter number: ");
        int num = sc.nextInt();
        String numLength = "" + num;
        int tempNum = num;

        System.out.println(numLength);

        int[] digit = new int[numLength.length()];
        int i = 0;

        while (true) {
            if (num < 0) {
                num = num * (-1);
                // digit[numLength.length() - 1] = num / (-1) * (int) Math.pow(10,
                // (numLength.length() - 1));
            }
            digit[i] = (num % 10);
            i++;
            num /= 10;

            if (num <= 0) {
                break;
            }
        }

        num = tempNum;

        if (digit[numLength.length() - 1] == 0) {
            digit[numLength.length() - 1] = -digit[numLength.length() - 2];
        }

        for (int j = digit.length - 1; j > 0; j--) {
            if (j == digit.length - 2 && num < 0) {
                continue;
            }
            System.out.printf("%d, ", digit[j]);
        }
        System.out.printf("%d", digit[0]);
    }
}
