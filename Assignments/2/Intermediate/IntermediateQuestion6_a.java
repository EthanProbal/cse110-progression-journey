import java.util.Scanner;

public class IntermediateQuestion6_a {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 20;
        int b = 30;

        int c;

        c = a; // c = 20
        a = b; // a = 30
        b = c; // b = 20

        System.out.printf("a = %d\n", a);
        System.out.printf("b = %d\n", b);

    }
}