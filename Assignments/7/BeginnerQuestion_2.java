import java.util.Scanner;

public class BeginnerQuestion_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 9, -5, 7, 9, -5, 5, 7 };

        System.out.println("Before Removing the Duplicates:");

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = 0;
                }
            }
        }

        System.out.println();
        System.out.println("After Removing the Duplicates:");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}