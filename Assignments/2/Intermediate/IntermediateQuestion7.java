import java.util.Scanner;

public class IntermediateQuestion7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int minutes = 3456789;

        int days = (minutes / 1440);
        int years = (days / 365);
        int remDays = (days % 365);

        System.out.printf("%d minutes is approximately %d years and %d days\n", minutes, years, remDays);

    }
}