import java.util.Scanner;

public class BeginnerQuestion_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("N = ");
        int N = sc.nextInt();

        double arr[] = new double[N];

        double tempMax = Double.NEGATIVE_INFINITY;
        double tempMin = Double.POSITIVE_INFINITY;
        int maxValueIndex = 0;
        int minValueIndex = 0;

        double summation = 0;
        double average = 0;

        for (int i = 0; i < N; i++) {
            System.out.printf("Enter the Number: ");
            arr[i] = sc.nextDouble();
            summation += arr[i];
        }

        for (int i = 0; i < N; i++) {
            if (tempMax < arr[i]) {
                tempMax = arr[i];
                maxValueIndex = i;
            }
            if (tempMin > arr[i]) {
                tempMin = arr[i];
                minValueIndex = i;
            }
        }

        average = (summation / N);

        System.out.printf("Maximum element %f found at index %d\n", tempMax, maxValueIndex);
        System.out.printf("Minimum element %f found at index %d\n", tempMin, minValueIndex);
        System.out.printf("Summation: %f\n", summation);
        System.out.printf("Average: %f\n", average);

    }
}