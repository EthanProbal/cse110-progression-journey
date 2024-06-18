import java.util.Scanner;

public class ExpertQuestion12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id = 23221454;
        int lastTwoDigit = (id % 100);

        int firstNum = (lastTwoDigit / 10);
        int lastNum = (lastTwoDigit % 10);

        System.out.println(lastNum);
        System.out.println(firstNum);

    }
}