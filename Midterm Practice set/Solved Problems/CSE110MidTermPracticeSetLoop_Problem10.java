import java.util.Scanner;

public class CSE110MidTermPracticeSetLoop_Problem10 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter Binary number: ");
        int binNum = sc.nextInt();
        int decEquivalent = 0;
        int n = 0, lastDig = 0;

        while (true) {
            if (binNum == 0) {
                break;
            }
            lastDig = binNum % 10;
            decEquivalent += (lastDig * (int) Math.pow(2, n));
            n++;
            binNum /= 10;
        }
        System.out.println(decEquivalent);
    }
}