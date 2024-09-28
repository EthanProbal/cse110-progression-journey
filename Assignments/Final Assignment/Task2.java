import java.util.Scanner;

public class Task2 {

    private static String modifyStrings(String S, String S1, String S2) {
        String newStr = S.replaceAll(S1, S2);
        return newStr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(modifyStrings("baddadda", "dd", "n"));

    }
}