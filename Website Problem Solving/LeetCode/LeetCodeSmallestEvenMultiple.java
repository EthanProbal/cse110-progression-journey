import java.util.Scanner;

public class LeetCodeSmallestEvenMultiple {

    private static int smallestEvenMultiple(int n) {
        int begin = 1;
        int end = begin;

        while (true) {
            if (end % n == 0 && end % 2 == 0) {
                break;
            } else {
                end++;
            }
        }

        return end;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the Number: ");
        int num = sc.nextInt();
        int endNum = smallestEvenMultiple(num);

        System.out.println(endNum);

    }
}