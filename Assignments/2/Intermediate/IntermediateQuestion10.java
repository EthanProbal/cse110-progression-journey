import java.util.Scanner;

public class IntermediateQuestion10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 100; // 100 ta number
        int a = 1; // First (Starting) number
        int L = 100; // Last (Ending) number

        int S = n * (a + L) / 2;

        System.out.printf("Sum : %d\n", S);
    }
}