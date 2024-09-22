import java.util.Scanner;

public class BeginnerQuestion_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("N = ");
        int N = sc.nextInt();

        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.printf("Enter a Number: ");
            arr[i] = sc.nextInt();
        }

        System.out.printf("Enter the Number to Find: ");
        int numToFind = sc.nextInt();

        for (int i = 0; i < N; i++) {
            if (arr[i] == numToFind && i < N) {
                System.out.printf("%d is at index %d\n", arr[i], i);
                break;
            } else if (i == N - 1) {
                System.out.printf("Element not found\n");
            }
        }

    }
}