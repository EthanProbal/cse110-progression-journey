import java.util.Scanner;

public class BeginnerQuestion1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;

        System.out.printf("Enter num a : ");
        int a = sc.nextInt();

        System.out.printf("Enter num b : ");
        int b = sc.nextInt();

        System.out.printf("Enter num c : ");
        int c = sc.nextInt();

        if (a > b)
            max = a;
        else if (a < b)
            max = b;

        if (c > max)
            System.out.printf("largest number: %d\n", c);
        else if (max > c)
            System.out.printf("largest number: %d\n", max);

    }
}