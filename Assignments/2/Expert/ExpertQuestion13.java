import java.util.Scanner;

public class ExpertQuestion13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id = 24121287; // My bracu student ID
        double distanceM = id % 10000; // output in meters

        int hr = 5;
        int min = 56;
        int sec = 23;

        double timeS = (hr * 3600) + (min * 60) + sec; // output in seconds

        double meterph = (distanceM / timeS);

        double kmph = (meterph * 3.6);
        double mph = meterph * (3600.0 / 1609.0);

        System.out.printf("Your velocity in km/h is %f\n", kmph);
        System.out.printf("Your velocity in miles/h is %f\n", mph);

    }
}