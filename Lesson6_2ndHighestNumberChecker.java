import java.util.Scanner;

public class Lesson6_2ndHighestNumberChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num 1 : ");
        double a = sc.nextDouble();

        System.out.print("Enter num 2 : ");
        double b = sc.nextDouble();

        System.out.print("Enter num 3 : ");
        double c = sc.nextDouble();

        boolean sit1 = (a < b) && (b < c); // B is the middle
        boolean sit2 = (b < c) && (c < a); // C is the middle
        boolean sit3 = (c < a) && (a < b); // A is the middle
        boolean sit4 = (a == b) && (b == c) && (c == a);
        boolean sit5 = (a == b) || (b == c) || (c == a);

        if (sit1) {
            System.out.println(b + " is the Middle num");
        } else if (sit2) {
            System.out.println(c + " is the Middle num");
        } else if (sit3) {
            System.out.println(a + " is the Middle num");
        } else if (sit4) {
            System.out.println("All the numbers are equal");
        } else if (sit5) {
            System.out.println("2 numbers are equal");
        }

    }
}