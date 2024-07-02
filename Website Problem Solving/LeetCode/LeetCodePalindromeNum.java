import java.util.Scanner;

public class LeetCodePalindromeNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter number: ");
        int num = sc.nextInt();

        int revNum = 0;

        if (num < 0)
            System.out.println("Not Palindrome");
        else if (num >= 0) {
            int temp = num;
            while (num != 0) {
                revNum = (revNum * 10) + (num % 10);
                num /= 10;
            }
            num = temp;
        }

        if (revNum == num)
            System.out.println("Palindrome");
        else if (revNum != num && revNum > 0)
            System.out.println("Not Palindrome");

    }
}