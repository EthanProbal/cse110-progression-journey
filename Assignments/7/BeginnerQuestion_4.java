import java.util.Scanner;

public class BeginnerQuestion_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("N = ");
        int N = sc.nextInt();

        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.printf("Original Array: \n");
        for (int i = 0; i < N; i++) {
            System.out.printf("%d ", arr[i]);
        }

        for (int i = 0; i < N; i++) {
            if (arr[i] > 0) {
                arr[i] = 1;
            } else if (arr[i] < 0) {
                arr[i] = 0;
            }

        }

        System.out.printf("\nAfter Modifying: \n");
        for (int i = 0; i < N; i++) {
            System.out.printf("%d ", arr[i]);
        }

    }
}