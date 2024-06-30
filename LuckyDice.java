import java.util.Random;
import java.util.Scanner;

public class LuckyDice {

    // scanner
    static Scanner scan = new Scanner(System.in);

    // random
    static Random random = new Random();

    // static declarations
    static String playerName;
    static int playerScore = 0;
    static int cpuScore = 0;
    static int matchPoint = 0;

    // game intro
    static void gameIntro() {
        System.out.println("--------========--------");
        System.out.println("|  /=/ Lucky Dice /=/  |");
        System.out.println("--------========--------");

        // rules
        System.out.println("Rules: Pick a match point and roll the dice against "
                + "\nthe computer to see who gets the first 3 matches.\n");
        System.out.println("Numbers are between 2 & 12. First player "
                + "\nto match 3 times wins the game. Good luck!");
    }

    // let's play message
    static void letsPlayTxt() {
        System.out.println("\n// Let's play! //");
        System.out.println("\nFirst Step // Get a match point.\n");
    }

    // player menu
    static void gameMenu() {
        System.out.println("// Game Play Menu //");
        System.out.println("// press 1 // Get match point");
        System.out.println("// press 2 // Roll dice");
        System.out.println("// press 3 // Quit Game");
    }

    // keep rolling message
    static void keepRolling() {
        System.out.println("\nPress '2' to roll dice... '3' to quit.");
    }

    // get match point
    static void getMatchPoint() {
        matchPoint = random.nextInt(11) + 2; // Random number between 2 and 12
        System.out.println("\nMatch point: //" + matchPoint + "//");
    }

    // scoreboard
    static void scoreboard() {
        System.out.println(":: Scoreboard ::");
        System.out.println(playerName + ": " + playerScore + " | Cpu: " + cpuScore);
        space();
    }

    // player wins
    static void playerWins() {
        playerScore++;
        System.out.println(playerName + " wins!");
    }

    // cpu wins
    static void cpuWins() {
        cpuScore++;
        System.out.println("Cpu wins!");
    }

    // tie win
    static void tieWin() {
        playerScore++;
        cpuScore++;
        System.out.println("It's a tie!");
    }

    // no winner
    static void noWinner() {
        System.out.println("No winner yet... roll again!");
    }

    // quit game
    static void quitGame() {
        System.out.println("You've exited the game... goodbye!");
    }

    // roll again
    static void rollAgain() {
        System.out.println("\nDo you want to roll again? Y/N ");
    }

    // space
    static void space() {
        System.out.println();
    }

    // random pick
    static int[] randomPick() {
        int diceOne = random.nextInt(6) + 1;
        int diceTwo = random.nextInt(6) + 1;
        int mySum = diceOne + diceTwo;

        int cpuDiceOne = random.nextInt(6) + 1;
        int cpuDiceTwo = random.nextInt(6) + 1;
        int cpuSum = cpuDiceOne + cpuDiceTwo;

        return new int[]{mySum, cpuSum};
    }

    // main
    public static void main(String[] args) {

        // intro
        gameIntro();

        System.out.print("\nEnter player name: ");
        playerName = scan.next();

        letsPlayTxt();
        scoreboard();

        boolean gameRunning = true;

        while (gameRunning) {
            gameMenu();
            int playerInput = scan.nextInt();

            switch (playerInput) {
                case 1:
                    getMatchPoint();
                    break;

                case 2:
                    int[] sums = randomPick();
                    int mySum = sums[0];
                    int cpuSum = sums[1];

                    System.out.println(playerName + " rolled: " + mySum);
                    System.out.println("Cpu rolled: " + cpuSum);

                    if (mySum == matchPoint && cpuSum != matchPoint) {
                        playerWins();
                    } else if (cpuSum == matchPoint && mySum != matchPoint) {
                        cpuWins();
                    } else if (mySum == matchPoint && cpuSum == matchPoint) {
                        tieWin();
                    } else {
                        noWinner();
                    }

                    scoreboard();

                    if (playerScore == 3 || cpuScore == 3) {
                        gameRunning = false;
                        System.out.println(playerScore == 3 ? playerName + " wins the game!" : "Cpu wins the game!");
                    }
                    break;

                case 3:
                    quitGame();
                    gameRunning = false;
                    break;

                default:
                    System.out.println("Invalid input. Please choose a valid option.");
            }
        }

        scan.close();
    }
}
