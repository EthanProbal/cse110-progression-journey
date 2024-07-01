import java.util.Scanner;

public class IntermediateQuestion10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float max = 0;
        float min = 0;

        System.out.printf("Enter num 1: ");
        float a = sc.nextFloat();

        System.out.printf("Enter num 2: ");
        float b = sc.nextFloat();

        System.out.printf("Enter num 3: ");
        float c = sc.nextFloat();

        // Max Value START:
        if (a < b)
            max = b;
        else if (a > b)
            max = a;

        if (max > c)
            max = max; // --> holds the Max value
        else if (max < c)
            max = c; // --> holds the Max value
        // Max Value END:

        // Min Value START:
        if (a < b)
            min = a;
        else if (a > b)
            min = b;

        if (min < c)
            min = min; // --> holds the Min value
        else if (min > c)
            min = c; // --> holds the Min value
        // Min Value END:

        System.out.printf("Maximum number is %f\n", max);
        System.out.printf("Minimum number is %f\n", min);

    }
}