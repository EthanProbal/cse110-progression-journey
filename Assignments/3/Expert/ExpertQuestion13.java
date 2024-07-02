import java.util.Scanner;

public class ExpertQuestion13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter num 1: ");
        int a = sc.nextInt();

        System.out.printf("Enter num 2: ");
        int b = sc.nextInt();

        System.out.printf("Enter num 3: ");
        int c = sc.nextInt();

        boolean allDifferent = (a != b) && (b != c) && (c != a);
        boolean allSame = (a == b) && (b == c) && (c == a);
        boolean twoDifOneSame = ((a == b) && b != c) || ((a == c) && c != b) || ((b == c) && c != a);

        if (allDifferent)
            System.out.println("All numbers are different");
        else if (allSame)
            System.out.println("All numbers are equal");
        else if (twoDifOneSame)
            System.out.println("Neither all are equal or different");

    }
}