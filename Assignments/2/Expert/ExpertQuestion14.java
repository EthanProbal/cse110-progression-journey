import java.util.Scanner;

public class ExpertQuestion14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = 8;
        double b = 3;
        double aHfSq = Math.pow((0.5 * a), 2);
        double bSq = Math.pow(b, 2);

        double cSq = aHfSq + bSq;
        double c = Math.sqrt(cSq);

        double TriAngleArea = 0.25 * a * b;
        double RectAngleArea = (a * c);

        double totalArea = (4 * TriAngleArea) + RectAngleArea;
        double circumference = 6 * c;

        System.out.printf("Area : %f sq unit\n", totalArea);
        System.out.printf("Circumference : %f unit\n", circumference);

    }
}