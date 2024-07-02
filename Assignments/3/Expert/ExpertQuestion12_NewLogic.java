import java.util.Scanner;

public class ExpertQuestion12_NewLogic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] taka = { 100, 50, 20, 10, 5, 2, 1 };
        int[] count = new int[taka.length];

        System.out.printf("Enter the amount the customer need to pay(Taka): ");
        int toPay = sc.nextInt();
        System.out.printf("Enter the amount, the customer gave(Taka): ");
        int given = sc.nextInt();

        int change = (given - toPay);

        if (change == 0)
            System.out.printf("The returned amount is %d taka\n", change);
        else if (change < 0)
            System.out.printf("Please pay %d taka more\n", (-1) * change);
        else if (change > 0) {
            for (int i = 0; i < taka.length; i++) {
                count[i] = change / taka[i];
                change -= count[i] * taka[i];
                if (taka[i] > 5)
                    System.out.printf("%d taka note: %d\n", taka[i], count[i]);
                else if (taka[i] <= 5)
                    System.out.printf("%d taka coin: %d\n", taka[i], count[i]);
            }

        }

    }

}