import java.util.Scanner;

public class LeetCodeReverseInteger {

    private static int revInt(int num) {
        boolean negative = false;

        if (num < 0) {
            num = -num;
            negative = true;
        }
        int tempNum = num;
        int lastDig = 0;
        int reverseNum = 0;

        while (true) {
            lastDig = tempNum % 10;
            reverseNum = reverseNum * 10 + lastDig;
            tempNum /= 10;

            if (tempNum == 0) {
                break;
            }
        }

        if (negative) {
            reverseNum = -reverseNum;
        }
        return reverseNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the Number to reverse: ");
        int num = sc.nextInt();
        int reversedNumber = revInt(num);

        System.out.printf("Reversed Number of %d is : %d", num, reversedNumber);

    }
}