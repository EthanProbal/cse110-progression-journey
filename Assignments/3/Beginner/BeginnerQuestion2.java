import java.util.Scanner;

public class BeginnerQuestion2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter your score: ");
        int score = sc.nextInt();

        boolean con1 = score <= 100 && score >= 90; // A
        boolean con2 = score <= 89 && score >= 85; // A-
        boolean con3 = score <= 84 && score >= 70; // B
        boolean con4 = score <= 69 && score >= 57; // C
        boolean con5 = score <= 56 && score >= 50; // D
        boolean con6 = score < 50; // F

        if (con1)
            System.out.println("Your grade is A");
        else if (con2)
            System.out.println("Your grade is A-");
        else if (con3)
            System.out.println("Your grade is B");
        else if (con4)
            System.out.println("Your grade is C");
        else if (con5)
            System.out.println("Your grade is D");
        else if (con6)
            System.out.println("Your grade is F");

    }
}