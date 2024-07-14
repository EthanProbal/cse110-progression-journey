import java.util.Scanner;

public class LeetCodeCountTheDigitsThatDivideANumber {

    private static int countDigitsThatDivideNum(int num) {
        int tempNum = num;

        int lastDig = 0;
        int divideCount = 0;

        while (true) {
            lastDig = tempNum % 10;

            if (num % lastDig == 0) {
                divideCount++;
            }
            tempNum /= 10;

            if (tempNum == 0) {
                break;
            }
        }

        return divideCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the Number: ");
        int num = sc.nextInt();
        int answer = countDigitsThatDivideNum(num);

        System.out.printf("%d is divisible by %d of its digits\n", num, answer);

    }
}