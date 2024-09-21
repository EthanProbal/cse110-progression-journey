import java.util.Scanner;

public class BeginnerQuestion_1_a {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("N = ");
        int arrLen = sc.nextInt();

        int num[] = new int[arrLen];

        for (int i = 0; i < num.length; i++) {
            System.out.printf("Enter a Number: ");
            num[i] = sc.nextInt();
        }

        System.out.printf("The Elements of the Array are: \n");
        for (int i = 0; i < num.length; i++) {
            System.out.printf("%d: %d\n", i, num[i]);
        }

        // System.out.printf("Enter Another Number: ");
        // int anotherNum = sc.nextInt();
        // int num2[] = new int[arrLen + 1];

        // for (int i = 0; i < num.length; i++) {
        // num2[i] = num[i];
        // }

        // num2[arrLen] = anotherNum;

        // System.out.printf("After Resizing the array: \n");
        // for (int i = 0; i < num2.length; i++) {
        // System.out.printf("%d ", num2[i]);
        // }
    }
}