import java.util.Scanner;

public class BeginnerQuestion_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length of Array 1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter Length of Array 2: ");
        int n2 = sc.nextInt();

        int arr1[] = new int[n1];
        int arr2[] = new int[n2];

        int subSetElementCount = 0;

        boolean isSubset;

        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Enter Number for Array 1: ");
            arr1[i] = sc.nextInt();
        }

        System.out.println();

        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Enter Number for Array 2: ");
            arr2[i] = sc.nextInt();
        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr2[j] == arr1[i]) {
                    subSetElementCount++;
                }
            }
        }

        if (subSetElementCount == arr2.length) {
            isSubset = true;
            System.out.println("Array 2 is a Subset of Array 1");
        } else {
            isSubset = false;
            System.out.println("Array 2 is Not a Subset of Array 1");
        }

    }
}