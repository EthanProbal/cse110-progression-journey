import java.util.Scanner;

public class FinalAssignment_5 {

    private static double calcTax(int age, double salary) {
        if (age < 18 || salary <= 10000) {
            return 0;
        } else if (salary > 10000 && salary <= 20000) {
            return salary * 0.07;
        } else {
            return salary * 0.14;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(calcTax(20, 18000));
    }
}