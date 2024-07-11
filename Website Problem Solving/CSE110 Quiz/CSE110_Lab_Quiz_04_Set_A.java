import java.util.Scanner;

public class CSE110_Lab_Quiz_04_Set_A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter heart rate: ");
        int num = sc.nextInt();

        // Found new Technique to Find the Highest and Lowest value inside a Loop

        int tempMax = Integer.MIN_VALUE;
        int tempMin = Integer.MAX_VALUE;
        int beats = 0;
        int sum = 0;

        // float tempMin = Float.POSITIVE_INFINITY; --> For the Same Technique
        // for Floats
        // float tempMax = Float.NEGATIVE_INFINITY;

        // double tempMax = Double.NEGATIVE_INFINITY; --> For the Same Technique
        // for Doubles
        // double tempMin = Double.POSITIVE_INFINITY;

        for (int i = 1; i <= num; i++) {
            System.out.printf("Enter heart rate %d: ", i);
            beats = sc.nextInt();
            sum += beats;

            if (beats > tempMax) {
                tempMax = beats;
            } else if (beats < tempMax) {
                tempMax = tempMax;
            }

            if (beats < tempMin) {
                tempMin = beats;
            } else if (beats > tempMin) {
                tempMin = tempMin;
            }
        }

        float avg = (float) sum / (float) num;
        System.out.printf("Heart rate range: %d - %d\n", tempMin, tempMax);
        System.out.printf("Average heart rate: %f\n", avg);
    }
}
