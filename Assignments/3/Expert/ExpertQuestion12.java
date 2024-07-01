import java.util.Scanner;

public class ExpertQuestion12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int j = 0;

        int[] notes = { 100, 50, 20, 10 };
        int[] coins = { 5, 2, 1 };

        int[] noteCount = { (notes[0] % 10), (notes[1] % 10), (notes[2] % 10), (notes[3] % 10) };
        int[] coinCount = { (coins[0] * 10) % 10, (coins[1] * 10) % 10, (coins[2] * 10) % 10 };

        System.out.printf("Enter the amount the customer need to pay(Taka): ");
        int toPay = sc.nextInt();
        System.out.printf("Enter the amount, the customer gave(Taka): ");
        int paid = sc.nextInt();

        int change = (paid - toPay);

        if (change > 0) {
            while (i < notes.length) {
                if (change < notes[i]) {
                    i++;
                } else if (change >= notes[i]) {
                    change -= notes[i];
                    noteCount[i]++;
                }
            }

            for (int k = 0; k < notes.length; k++) {
                System.out.printf("%d taka note: %d\n", notes[k], noteCount[k]);
            }

            while (j < coins.length) {
                if (change < coins[j]) {
                    j++;
                } else if (change >= coins[j]) {
                    change -= coins[j];
                    coinCount[j]++;
                }
            }

            for (int l = 0; l < coins.length; l++) {
                System.out.printf("%d taka coin: %d\n", coins[l], coinCount[l]);
            }

        } else if (change < 0) {
            System.out.printf("Please pay %d taka more\n", (-1) * change);
        } else if (change == 0) {
            System.out.printf("The return amount is 0 taka\n");
        }

    }
}