import java.util.Scanner;

class Game {
    public int originalNum, numMaxRange, numMinRange;
    public int guessedNum, score;

    public Game(int oN, int max, int min) {
        originalNum = oN;
        numMaxRange = max;
        numMinRange = min;
        score = 0;
    }

    public void inputNum(int gN) {
        guessedNum = gN;
    }

    public void upScore() {
        score++;
    }

}

public class Lesson10_Project_GuessTheNumberGame_OOPsEdition {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Game gm = new Game(34, 50, 25);

        while (true) {
            System.out.printf("Guess a number between %d and %d: ", gm.numMaxRange, gm.numMinRange);
            int num = sc.nextInt();

            gm.inputNum(num);

            if (gm.guessedNum > gm.originalNum) {
                System.out.printf("The Number is Greater\n");
                gm.upScore();
            } else if (gm.guessedNum < gm.originalNum) {
                System.out.printf("The Number is Smaller\n");
                gm.upScore();
            } else if (gm.guessedNum == gm.originalNum) {
                System.out.printf("You Won! Your score is %d\n", gm.score);
                break;
            }
        }

    }
}