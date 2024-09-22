import java.util.Scanner;

public class BeginnerQuestion_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 23, 100, 0, 0, 100 };
        int newArrLen = 0;
        int newArrIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = Integer.MIN_VALUE;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != Integer.MIN_VALUE) {
                newArrLen++;
            }
        }

        int[] newArr = new int[newArrLen];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != Integer.MIN_VALUE) {
                newArr[newArrIndex] = arr[i];
                newArrIndex++;
            }
        }

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }

    }
}