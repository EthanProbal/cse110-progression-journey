import java.util.Scanner;

public class BeginnerQuestion1_a {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = 24;
        int end = -6;

        while (true) {
            System.out.printf("%d, ", start);
            start -= 6;

            if (start <= end) {
                System.out.printf("%d", start);
                break;
            }
        }

    }
}
