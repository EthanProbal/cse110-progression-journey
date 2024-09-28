import java.util.Scanner;

public class Task5 {

    private static int toDecimal(String binaryNum) {
        String[] digit = binaryNum.split("");
        int decimalVal = 0;

        for (int i = 0; i < digit.length; i++) {
            int d = Integer.parseInt(digit[i]);
            decimalVal += d * (int) Math.pow(2, (digit.length - 1) - i);

        }

        return decimalVal;
    }

    private static String toHex(int num) {
        String oppHex = "";
        String trueHex = "";

        while (true) {
            if (num == 0) {
                break;
            }

            int rem = num % 16;

            if (rem == 10) {
                oppHex += "A";
            } else if (rem == 11) {
                oppHex += "B";
            } else if (rem == 12) {
                oppHex += "C";
            } else if (rem == 13) {
                oppHex += "D";
            } else if (rem == 14) {
                oppHex += "E";
            } else if (rem == 15) {
                oppHex += "F";
            } else {
                oppHex += rem + "";
            }

            num /= 16;
        }

        for (int i = oppHex.length() - 1; i >= 0; i--) {
            trueHex += oppHex.charAt(i);
        }

        return trueHex;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(toDecimal("101010"));
        System.out.println(toHex(toDecimal("101010")));

    }
}