import java.util.Scanner;

public class Task4 {

    private static void isHappyNumber(int n) {
        for (int i = 1; i < 999; i++) {
            int num = n;
            int sum = 0;
            boolean happy = false;

            while (true) {
                if (num == 0) {
                    break;
                }

                int lastDig = num % 10;
                sum += (int) Math.pow(lastDig, 2);
                num /= 10;
            }

            if (sum != 1) {
                n = sum;
            } else if (sum == 1) {
                happy = true;
                System.out.println(happy);
            }

            if (happy == true) {
                break;
            } else if (i == 998) {
                System.out.println(false);
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        isHappyNumber(100);

    }
}