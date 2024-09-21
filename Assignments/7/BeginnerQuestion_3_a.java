import java.util.Scanner;

public class BeginnerQuestion_3_a {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the Length of the Array: ");
        int N = sc.nextInt();

        int arr[] = new int[N];
        int arrRev[] = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.printf("Enter a number: ");
            arr[i] = sc.nextInt();
            arrRev[N - 1 - i] = arr[i];
        }

        System.out.printf("Reversed using a New Array: \n");
        for (int i = 0; i < N; i++) {
            System.out.printf("%d ", arrRev[i]);
        }

    }
}