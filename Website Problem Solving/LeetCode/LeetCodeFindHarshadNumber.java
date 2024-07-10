import java.util.Scanner;

public class LeetCodeFindHarshadNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter Number: ");
        int num = sc.nextInt();
        int lastDig = 0;
        int sumOfDig = 0;

        int tempNum = num;

        while (true) {
            lastDig = num % 10;
            num /= 10;
            sumOfDig += lastDig;

            if (num == 0) {
                break;
            }
        }

        num = tempNum;

        if (num % sumOfDig == 0) {
            System.out.println("Harshad Number");
        } else if (num % sumOfDig != 0) {
            System.out.println("Not Harshad Number");
        }
    }
}