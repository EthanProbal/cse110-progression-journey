import java.util.Scanner;

public class FinalAssignment_2 {

    private static double circleArea(int n) {
        double area = 3.1416 * n * n;
        return area;
    }

    private static double sphereVolume(int n) {
        double volume = (4 / 3) * 3.1416 * n * n * n;
        return volume;
    }

    private static String findSpace(int n, String thing) {
        if (thing == "circle") {
            return circleArea(n) + "";
        } else if (thing == "sphere") {
            return sphereVolume(n) + "";
        } else {
            return "Wrong Parameter";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(circleArea(5));
        System.out.println(sphereVolume(5));
        System.out.println(findSpace(5, "boom"));

    }
}