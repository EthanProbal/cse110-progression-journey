import java.util.Scanner;

public class BeginnerQuestion1_b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = -10;
        int end = 20;

        while (true) {
            System.out.printf("%d, ", start);
            start += 5;

            if (start >= end) {
                System.out.printf("%d", start);
                break;
            }
        }

    }
}
