import java.util.Scanner;

public class LeetCodeSubtractProductAndSum {

    private static int subtractProductAndSum(int n) {
        int tempNum = n;

        int sum = 0;
        int product = 1;
        int lastDig = 0;

        while (true) {
            lastDig = tempNum % 10;
            product *= lastDig;
            sum += lastDig;
            tempNum /= 10;

            if (tempNum == 0) {
                break;
            }
        }

        return (product - sum);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(subtractProductAndSum(4421));

    }
}