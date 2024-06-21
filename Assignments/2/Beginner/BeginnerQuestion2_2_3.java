import java.util.Scanner;

public class BeginnerQuestion2_2_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 10;
        int b = 20;

        int product = (a * b);
        int division_1 = (a / b);
        int division_2 = (b / a);

        System.out.printf("Product : %d\n", product);
        System.out.printf("Division 1 (a / b): %d\n", division_1);
        System.out.printf("Division 2 (b / a): %d\n", division_2);

    }
}