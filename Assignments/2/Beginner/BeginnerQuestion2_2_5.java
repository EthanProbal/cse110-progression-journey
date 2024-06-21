import java.util.Scanner;

public class BeginnerQuestion2_2_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = 10;
        int b = 20;

        double result = (a + b);
        double product = (a * b);
        double division_1 = (a / b);
        double division_2 = (b / a);

        System.out.printf("Sum : %f\n", result);
        System.out.printf("Product : %f\n", product);
        System.out.printf("Division 1 (a / b): %f\n", division_1);
        System.out.printf("Division 2 (b / a): %f\n", division_2);

    }
}