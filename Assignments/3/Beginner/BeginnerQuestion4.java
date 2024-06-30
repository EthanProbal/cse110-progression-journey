import java.util.Scanner;

public class BeginnerQuestion4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter number: ");
        int num = sc.nextInt();

        boolean con1 = (num % 5 == 0) && (num % 7 == 0); // both 5 & 7
        boolean con2 = (num % 5 == 0); // both 5
        boolean con3 = (num % 7 == 0); // both 7
        boolean con4 = (num % 5 != 0) && (num % 7 != 0); // No

        if (con1)
            System.out.printf("Divisible by Both\n", num);
        else if (con2)
            System.out.printf("Invalid: Divisible by 5 only\n", num);
        else if (con3)
            System.out.printf("Invalid: Divisible by 7 only\n", num);
        else if (con4)
            System.out.printf("No\n", num);

    }
}