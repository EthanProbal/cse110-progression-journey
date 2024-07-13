import java.util.Scanner;

public class CSE110MidTermPracticeSetLoop_Problem12 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int num = 0;
        int tempMax = Integer.MIN_VALUE;
        int tempMin = Integer.MAX_VALUE;

        int sum = 0, posEvenInts = 0;
        double avg = 0;

        while (true) {
            System.out.printf("Enter number: ");
            num = sc.nextInt();

            if (num == 0) {
                break;
            } else if (num % 2 == 0 && num > 0) {
                sum += num;
                posEvenInts++;

                if (num > tempMax) {
                    tempMax = num;
                }
                if (num < tempMin) {
                    tempMin = num;
                }
            }

        }
        avg = (double) sum / (double) posEvenInts;

        System.out.printf("Max: %d\n", tempMax);
        System.out.printf("Min: %d\n", tempMin);
        System.out.printf("Average: %f\n", avg);
    }
}