import java.util.Random;
import java.util.Scanner;

public class LuckyDice {

	// scanner
	static Scanner scan = new Scanner(System.in);

	// random
	static Random random = new Random();

	// static declarations
	static String playerName;
	static int userScore = 0;
	static int cpuScore = 0;
	static int matchPoint = 0;

	// game intro
	static void gameIntro() {
		System.out.println("--------========--------");
		System.out.println("|  /=/ Lucky Dice /=/  |");
		System.out.println("--------========--------");

		//rules
		System.out.println("Rules: Pick a match point and roll the dice against "
				+ "\nthe computer to see who gets the first 3 matches.\n");
		System.out.println("Numbers are between 2 & 12. First player "
				+ "\nto match 3 times wins the game. Good luck!");
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
		System.out.println("\nPress '2' to roll dice...");
	}

	static void matchPoint() {
		matchPoint = random.nextInt(2,12)+1;
		System.out.println("Match point: //" + matchPoint + "//");
	}

	static void scoreboard() {
		System.out.println(":: Scoreboard ::");
		System.out.println(playerName + ": " + userScore + " | Cpu: " + cpuScore);
		space();
	}

	static void playerWins() {
		userScore++;
		System.out.println(playerName + " wins!");
	}

	static void cpuWins() {
		cpuScore++;
		System.out.println("Cpu wins!");
	}

	static void tieWin() {
		userScore++;
		cpuScore++;
		System.out.println("It's a tie!");
	}

	static void noWinner() {
		System.out.println("No winner yet... roll again!");
	}

	static void quitGame() {
		System.out.println("You've exited the game... goodbye!");
	}

	static void rollAgain() {
		System.out.println("\nDo you want to roll again? Y/N ");
	}

	static void space() {
		System.out.println();
	}

	// main
	public static void main(String[] args) {

		// declarations
		int userInput = 0;
		int diceOne = 0;
		int diceTwo = 0;
		int cpuDiceOne = 0;
		int cpuDiceTwo = 0;
		int gameScore = 0;
		int mySum = 0;
		int cpuSum = 0;
		int num1 = 0;
		int num2 = 0;
		int matchPoint = 0;
		boolean rollAgain = false;

		// intro
		gameIntro();

		System.out.print("\nEnter player name: ");
		playerName = scan.next();

		System.out.println("\n// Let's play! //");
		System.out.println("\nFirst Step // Get a match point.\n");
		scoreboard();

		// gameplay menu
		gameMenu();

		userInput = scan.nextInt();

		while (userInput != 3) {

			num1 = random.nextInt(6)+1;
			num2 = random.nextInt(6)+1;

			matchPoint = num1 + num2;

			space();
			matchPoint(); 		

			keepRolling();

			userInput = scan.nextInt();

			if (userInput == 1) {

			}	

			if (userInput == 2) {

				diceOne = random.nextInt(6)+1;
				diceTwo = random.nextInt(6)+1;

				mySum = diceOne + diceTwo;

				cpuDiceOne = random.nextInt(6)+1;
				cpuDiceTwo = random.nextInt(6)+1;

				cpuSum = cpuDiceOne + cpuDiceTwo;
			}

			System.out.println("\n------------------------------------------");
			System.out.println(playerName + " rolled ((" + mySum + ")) /=/=/ Cpu rolled ((" + cpuSum + "))");
			System.out.println("------------------------------------------");

			if (mySum == matchPoint && cpuSum != matchPoint) {
				userScore++;
				scoreboard();
				playerWins();
				rollAgain();
				
				String playerChoice = scan.nextLine();
				
				if (playerChoice == "y") {
				
			} 

			if (mySum != matchPoint && cpuSum == matchPoint) {
				cpuScore++;
				scoreboard();
				cpuWins();
				break;
			}

			if (mySum == matchPoint && cpuSum == matchPoint) {
				userScore++;
				cpuScore++;
				scoreboard();
				tieWin();
			} 

			if (mySum != matchPoint && cpuSum != matchPoint) {
				gameMenu();
				scoreboard();
				noWinner();
			}


		}

	}

}
