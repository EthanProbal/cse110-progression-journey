import java.util.Scanner;

public class BeginnerQuestion_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("How many times Do you want the Loop to Run?: ");
        int loopRunTimes = sc.nextInt();

        for (int j = 0; j < loopRunTimes; j++) {

            int sum = 0;

            System.out.printf("Enter X: ");
            int startNum = sc.nextInt();

            if (startNum % 2 == 0) {
                startNum++;
            }

            System.out.printf("Enter Y: ");
            int Y = sc.nextInt();

            int endNum = startNum + ((Y - 1) * 2);

            for (int i = startNum; i <= endNum; i += 2) {
                sum += i;
            }

            System.out.printf("Sum: %d\n", sum);

        }

    }

}
