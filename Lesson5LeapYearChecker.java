import java.util.Scanner;

public class Lesson5LeapYearChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Year : ");
        int year = sc.nextInt();

        boolean check1 = (year % 4 == 0) && (year % 100 != 0);
        boolean check2 = (year % 400 == 0);

        if (check1 || check2) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }

        // if (year % 4 == 0 && year % 100 != 0) {
        // System.out.println("Leap Year");
        // } else if (year % 400 == 0) {
        // System.out.println("Leap year");
        // }

        // else {
        // System.out.println("Not Leap Year");
        // }

    }
}