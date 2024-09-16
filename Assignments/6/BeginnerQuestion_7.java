import java.util.Scanner;

public class BeginnerQuestion_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String 1: ");
        StringBuilder str1 = new StringBuilder(sc.nextLine());

        System.out.print("Enter String 2: ");
        StringBuilder str2 = new StringBuilder(sc.nextLine());

        for (int k = 0; k < 2; k++) {
            for (int i = 0; i < str1.length(); i++) {
                for (int j = 0; j < str2.length(); j++) {
                    if (str2.charAt(j) == str1.charAt(i)) {
                        str2.delete(j, j + 1);
                        str1.delete(i, i + 1);
                        i = 0;
                        j = 0;
                    }

                }
            }
        }

        String finalStr = str1.toString().toUpperCase() + str2.toString().toUpperCase();
        System.out.println(finalStr);

    }

}
