import java.util.Scanner;

public class ExpertQuestion11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = 4.5d;
        double b = 9.5d;
        double cSquare = (b * b) - (a * a);

        double c = Math.sqrt(cSquare);

        double sinA = (a / c);
        double sinB = (b / c);
        double cosA = (b / c);
        double cosB = (a / c);

        System.out.printf("sinA = %f\n", sinA);
        System.out.printf("cosA = %f\n", cosA);
        System.out.printf("sinB = %f\n", sinB);
        System.out.printf("cosB = %f\n", cosB);

    }
}