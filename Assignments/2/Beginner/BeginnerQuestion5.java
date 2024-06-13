import java.util.Scanner;

public class BeginnerQuestion5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inch = 1000;
        double inchToMeter = 0.0254d;

        double meter = (inch * inchToMeter);

        System.out.println("Converted : " + meter);

    }
}