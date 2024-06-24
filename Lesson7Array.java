import java.util.Scanner;

public class Lesson7Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // I will declare an array, and make 5 int spaces in the ram

        // int[] marks = new int[5];

        // marks[0] = 10;
        // marks[1] = 20;
        // marks[2] = 30;
        // marks[3] = 40;
        // marks[4] = 50;

        // for (int i = 0; i < marks.length; i++) {
        // System.out.printf("%d ", marks[i]);
        // }

        // float[] nums = new float[5];

        // nums[0] = 3.1416f;
        // nums[1] = 10f;
        // nums[2] = 15f;
        // nums[3] = 85f;
        // nums[4] = 100f;

        // for (int i = (nums.length - 1); i >= 0; i--) {
        // System.out.printf("%f ", nums[i]);
        // }

        // double[] myNums = { 100f, 200f, 300f, 400f, 500f };

        // for (int i = 0; i < myNums.length; i++) {
        // System.out.printf("%f ", myNums[i]);
        // }

        byte[] smallNums;
        smallNums = new byte[5];

        smallNums[0] = 10;
        smallNums[1] = 20;
        smallNums[2] = 30;
        smallNums[3] = 40;
        smallNums[4] = 50;

        for (int i = 0; i < smallNums.length; i++) {
            System.out.printf("%d\n", smallNums[i]);
        }

    }
}