import java.util.Scanner;

public class Task9 {

    // private static void getScores(char[] c, int[] scores) {
    // int[] scores = new int[c.length];
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] studentGrades = { 'A', 'A', 'A', 'B', 'C', 'U', 'Z' };
        int[] studentScores = new int[studentGrades.length];

        for (int i = 0; i < studentGrades.length; i++) {
            if (studentGrades[i] == 'A') {
                studentScores[i] = 100;
            } else if (studentGrades[i] == 'B') {
                studentScores[i] = 90;
            } else if (studentGrades[i] == 'C') {
                studentScores[i] = 70;
            } else {
                studentScores[i] = 0;
            }
        }

        for (int i = 0; i < studentScores.length; i++) {
            System.out.println(studentScores[i]);
        }

    }
}