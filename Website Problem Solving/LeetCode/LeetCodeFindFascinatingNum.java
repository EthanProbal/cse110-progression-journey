import java.util.Scanner;

public class LeetCodeFindFascinatingNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int n1 = num;
        int n2 = num * 2;
        int n3 = num * 3;

        int count = 0;

        String concate = "" + n1 + n2 + n3;

        if (concate.length() > 9) {
            System.out.println(concate + " not Fascinating");
            count = concate.length();
        } else if (concate.length() == 9) {
            for (int i = 0; i < concate.length(); i++) {
                if (concate.charAt(i) != '0') {
                    count++;
                }
            }
        }

        if (count == 9)
            System.out.println(concate + " is Fascinating");
        else if (count < 9)
            System.out.println(concate + " not Fascinating");
    }
}