import java.util.Scanner;

public class CSE110_MidTerm_Find_The_Highest_Valued_Item {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("How many items do you want to buy?: ");
        int N = sc.nextInt();
        sc.nextLine(); // --> used to Consume the \n given by the Previous N input

        String[] names = new String[N];
        int[] price = new int[N];

        int tempMax = Integer.MIN_VALUE;
        String tempName = "eminem";

        for (int i = 0; i < N; i++) {
            System.out.printf("Enter item %d: ", i + 1);
            names[i] = sc.nextLine();

            System.out.printf("Enter price of %d: ", i + 1);
            price[i] = sc.nextInt();
            sc.nextLine(); // --> used to Consume the \n given by the Previous price[i] input

            if (price[i] > tempMax) {
                tempMax = price[i];
                tempName = names[i];

            }
        }

        System.out.printf("%s is the Highest priced: %d\n", tempName, tempMax);
    }
}