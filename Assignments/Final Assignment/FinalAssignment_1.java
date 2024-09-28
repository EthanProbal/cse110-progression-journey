import java.util.Scanner;

public class FinalAssignment_1 {

    private static String evenChecker(int n) {
        if (n % 2 == 0) {
            return "Even!";
        } else if (n % 2 != 0) {
            return "Odd!";

        } else {
            return "Boss";
        }

    }

    private static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isPos(int n) {
        if (n > 0) {
            return true;
        } else {
            return false;
        }
    }

    private static void sequence(int n) {
        if (n > 0) {
            for (int i = 0; i <= n; i += 2) {
                System.out.printf("%d ", i);
            }
        } else if (n < 0) {
            if (n % 2 == 0) {
                n++;
            }
            for (int i = n; i <= -1; i += 2) {
                System.out.printf("%d ", i);
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(evenChecker(11));
        System.out.println(isEven(9));
        System.out.println(isPos(-1));
        sequence(10);

    }
}