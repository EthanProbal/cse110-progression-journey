import java.util.Scanner;

public class BeginnerQuestion_8 {

    private static void armstrongChecker(int n) {

        int num = n;
        int sum = 0;

        int tempNum = num;
        int lastDig = 0;

        while (true) {
            if (tempNum == 0) {
                break;
            }

            lastDig = tempNum % 10;
            sum += (int) Math.pow(lastDig, 3);
            tempNum /= 10;

        }

        if (sum == num) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Starting Number: ");
        int startNum = sc.nextInt();

        System.out.print("Enter Ending Number: ");
        int endNum = sc.nextInt();

        System.out.print("Armstrong Numbers: \n");
        for (int i = startNum; i <= endNum; i++) {
            armstrongChecker(i);
        }

    }

}