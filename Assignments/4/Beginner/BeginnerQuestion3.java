import java.util.Scanner;

public class BeginnerQuestion3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;
        int sqr = 0;

        while (true) {
            System.out.printf("Enter Number: ");
            num = sc.nextInt();
            if (num < 0)
                break;
            sqr = (num * num);
            System.out.printf("%d ^ 2 = %d\n", num, sqr);
        }

    }
}