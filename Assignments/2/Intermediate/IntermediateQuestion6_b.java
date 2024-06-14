import java.util.Scanner;

public class IntermediateQuestion6_b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 100;
        int b = 200;

        a = (a + b);
        b = (a - b);
        a = (a - b);

        System.out.printf("a = %d\n", a);
        System.out.printf("b = %d\n", b);

    }
}