import java.util.Scanner;

public class HackerRankProblem1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        double b = sc.nextDouble();
        sc.nextLine(); // Eats the \n given by the nextDouble method

        String c = sc.nextLine();

        System.out.println("String: " + c);
        System.out.println("Double: " + b);
        System.out.println("Int: " + a);
    }
}