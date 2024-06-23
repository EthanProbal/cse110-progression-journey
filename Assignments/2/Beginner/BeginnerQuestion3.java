import java.util.Scanner;

public class BeginnerQuestion3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pi = 3.1416d;

        // System.out.println("Enter radius: ");
        // double r = sc.nextDouble();

        double r = 4d;

        double area = pi * r * r;
        double circumference = 2 * pi * r;

        System.out.println("Area: " + area);
        System.out.println("Circumference : " + circumference);

    }
}
