import java.util.Scanner;

public class BeginnerQuestion_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the Phrase: ");
        String str = sc.nextLine();
        int vCount = 0, cCount = 0;

        for (int i = 0; i < str.length(); i++) {
            boolean vCheckCon = (int) str.charAt(i) == 65 || (int) str.charAt(i) == 69 || (int) str.charAt(i) == 73
                    || (int) str.charAt(i) == 79 || (int) str.charAt(i) == 85 || (int) str.charAt(i) == 97
                    || (int) str.charAt(i) == 101 || (int) str.charAt(i) == 105 || (int) str.charAt(i) == 111
                    || (int) str.charAt(i) == 117;

            boolean cCheckCon = ((int) str.charAt(i) >= 66 && (int) str.charAt(i) <= 90) || ((int) str.charAt(i) >= 98
                    && (int) str.charAt(i) <= 122);

            if (vCheckCon) {
                vCount++;
            } else if (cCheckCon) {
                cCount++;
            }

        }

        if (vCount > 0 && cCount > 0) {
            if (vCount % 3 == 0 && cCount % 5 == 0) {
                System.out.printf("Aaarr! Me Plunder\n");
            } else {
                System.out.printf("Blimey! No Plunder!!!\n");
            }
        } else {
            System.out.printf("Blimey! No Plunder!!!\n");
        }
    }

}