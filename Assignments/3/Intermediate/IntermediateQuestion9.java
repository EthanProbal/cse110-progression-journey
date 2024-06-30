import java.util.Scanner;

public class IntermediateQuestion9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter payment: ");
        int pay = sc.nextInt();

        System.out.printf("Enter age: ");
        int age = sc.nextInt();

        double fiveP = 0.05d;
        double tenP = 0.1d;

        boolean con1 = (age >= 18) && (pay < 10000); // No Tax
        boolean con2 = (age >= 18) && (pay >= 10000) && (pay <= 20000); // 5%
        boolean con3 = (age >= 18) && (pay > 20000); // 10%
        boolean con4 = (age < 18); // No Tax

        double c2Tax = (pay * fiveP);
        double c3Tax = (pay * tenP);

        if (con1)
            System.out.printf("Your tax amounts in 0 Tk\n");
        else if (con2)
            System.out.printf("Your tax amounts in %d Tk\n", (int) c2Tax);
        else if (con3)
            System.out.printf("Your tax amounts in %d Tk\n", (int) c3Tax);
        else if (con4)
            System.out.printf("Your tax amounts in 0 Tk\n");

    }
}