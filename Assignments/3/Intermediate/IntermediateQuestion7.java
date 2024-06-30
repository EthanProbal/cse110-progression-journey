import java.util.Scanner;

public class IntermediateQuestion7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter value of x: ");
        int x = sc.nextInt();

        boolean con1 = (x < 2);
        boolean con2 = (x >= 0 && x < 2);
        boolean con3 = (x >= 2 && x < 5);
        boolean con4 = (x >= 5);

        int xSqr = (int) Math.pow(x, 2);

        int f1 = (2 * x);
        int f2 = (x + 1);
        int f3 = (xSqr - 1);
        int f4 = (3 * xSqr + 2);

        if (con1)
            System.out.printf("%d\n", f1);
        else if (con2)
            System.out.printf("%d\n", f2);
        else if (con3)
            System.out.printf("%d\n", f3);
        else if (con4)
            System.out.printf("%d\n", f4);
    }
}