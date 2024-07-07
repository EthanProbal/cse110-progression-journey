import java.util.Scanner;

public class BeginnerQuestion11_b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter number: ");
        int num = sc.nextInt();

        int isPerfect = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                isPerfect += i;
            }
        }

        if (isPerfect == num)
            System.out.printf("Perfect\n");
        else if (isPerfect != num)
            System.out.printf("Not Perfect\n");
    }
}