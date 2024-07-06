import java.util.Scanner;

public class BeginnerQuestion9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter number: ");
        int n = sc.nextInt();
        int digit = 0;

        while (true) {
            if (n == 0)
                break;
            else if (n != 0) {
                n /= 10;
                digit++;
            }
        }

        System.out.println(digit);

    }
}