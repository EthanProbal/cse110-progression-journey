import java.util.Scanner;

public class IntermediateQuestion6_b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 100;
        int b = 200;

        a = (a + b); // (100 + 200) = 300
        // a = 300

        b = (a - b); // (300 - 200) = 100
        // b = 100 // Value swapped!

        a = (a - b); // (300 - 100) = 200
        // a = 200 // Value swapped!

        System.out.printf("a = %d\n", a);
        System.out.printf("b = %d\n", b);

    }
}