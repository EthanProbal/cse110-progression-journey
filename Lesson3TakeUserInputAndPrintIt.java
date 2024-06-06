import java.util.Scanner;

// Take int, float, string and print it on the screen (typecasting is not that necessary)

public class Lesson3TakeUserInputAndPrintIt {

    public static void main(String[] args) {
        System.out.println("Test");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Num1 (Enter Float value) : ");
        float num1 = sc.nextFloat();

        System.out.print("Enter the Num2 (Enter Byte value) : ");
        byte num2 = sc.nextByte();

        float sum = (float) num1 + (float) num2;

        System.out.println(sum + " answer in double");

        boolean test = sc.hasNextInt();

        System.out.println(test);

        // String str = sc.next();
        String str = sc.nextLine();

        System.out.println(str);

    }

}