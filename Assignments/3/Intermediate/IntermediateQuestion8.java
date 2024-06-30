import java.util.Scanner;

public class IntermediateQuestion8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter BRACU Student ID: ");
        int id = sc.nextInt(); // 16101307

        int f3Digit = (id / 100000); // 161

        int yr = (f3Digit / 10); // 16
        int session = (f3Digit % 10); // 1

        switch (session) {
            case 1 -> System.out.printf("Student Joined BRAC in Spring %d\n", yr);
            case 2 -> System.out.printf("Student Joined BRAC in Fall %d\n", yr);
            case 3 -> System.out.printf("Student Joined BRAC in Summer %d\n", yr);
        }
    }
}