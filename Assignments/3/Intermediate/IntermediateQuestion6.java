import java.util.Scanner;

public class IntermediateQuestion6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter Number: ");
        int num = sc.nextInt();

        boolean con1 = (num > 0) && (num % 2 == 0); // posEven
        boolean con2 = (num > 0) && (num % 2 != 0); // posOdd
        boolean con3 = (num < 0); // negative
        boolean con4 = (num == 0); // isZero

        if (con1)
            System.out.println("Positive is positive and even");
        else if (con2)
            System.out.println("Positive is positive and odd");
        else if (con3)
            System.out.println("Number is negative");
        else if (con4)
            System.out.println("Number is zero");

    }
}