import java.util.Scanner;

public class ExpertQuestion11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter length 1: ");
        int a = sc.nextInt();

        System.out.printf("Enter length 2: ");
        int b = sc.nextInt();

        System.out.printf("Enter length 3: ");
        int c = sc.nextInt();

        boolean scalene = (a != b) && (b != c) && (c != a);
        boolean equilateral = (a == b) && (b == c) && (c == a);
        boolean isoSceles = ((a == b) && b != c) || ((a == c) && c != b) || ((b == c) && c != a);

        if (scalene)
            System.out.println("This is a Scalene triangle");
        else if (isoSceles)
            System.out.println("This is a Isosceles triangle");
        else if (equilateral)
            System.out.println("This is a Equilateral triangle");

    }
}