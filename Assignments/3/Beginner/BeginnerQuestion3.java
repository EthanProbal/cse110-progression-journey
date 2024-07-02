import java.util.Scanner;

public class BeginnerQuestion3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.printf("Enter number 2: ");
        int num2 = sc.nextInt();

        System.out.printf("Enter operator: ");
        String operator = sc.next();

        boolean con1 = operator.equals("+");
        boolean con2 = operator.equals("-");
        boolean con3 = operator.equals("*");
        boolean con4 = operator.equals("/");

        if (con1)
            System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
        else if (con2)
            System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
        else if (con3)
            System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
        else if (con4)
            System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
    }
}