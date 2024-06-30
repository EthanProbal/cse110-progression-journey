import java.util.Scanner;

public class IntermediateQuestion5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter Year: ");
        int yr = sc.nextInt();

        boolean con1 = (yr % 4 == 0) && (yr % 100 != 0);
        boolean con2 = (yr % 400) == 0;

        if (con1 || con2)
            System.out.printf("%d is a leap year\n", yr);
        else
            System.out.printf("%d is not a leap year\n", yr);

    }
}