import java.util.Scanner;

public class CSE110MidTermPracticeSetLoop_Problem11 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("How many Numbers?: ");
        int N = sc.nextInt();
        int userInputNum = 0;

        int tempMax = Integer.MIN_VALUE;
        int tempMin = Integer.MAX_VALUE;

        int sum = 0, posEvenInts = 0;
        double avg = 0;

        for (int i = 1; i <= N; i++) {
            userInputNum = sc.nextInt();
            if (userInputNum % 2 == 0 && userInputNum > 0) {
                posEvenInts += 1;
                sum += userInputNum;
                if (userInputNum > tempMax) {
                    tempMax = userInputNum;
                }
                if (userInputNum < tempMin) {
                    tempMin = userInputNum;
                }
            }
        }
        System.out.printf("Max value: %d\n", tempMax);
        System.out.printf("Min value: %d\n", tempMin);

        if (posEvenInts != 0) {
            avg = (double) sum / (double) posEvenInts;
            System.out.printf("Average: %f\n", avg);
        } else if (posEvenInts == 0) {
            System.out.printf("Average: %d\n", 0);
        }

    }
}