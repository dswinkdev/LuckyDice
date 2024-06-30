# Lucky Dice
Lucky Dice is a game where you play against the computer to see who can match the random point first.

Here's a summary you can use for your GitHub repository:

---

### Overview
Lucky Dice is a simple dice game where you compete against the computer to reach a match point and win the game. The first player to match the designated point three times wins. The game features straightforward gameplay mechanics, making it a fun and quick game to play.

### Rules
1. **Match Point**: A random match point between 2 and 12 is selected.
2. **Rolling Dice**: Both the player and the computer roll two dice each. The sums of the dice are compared to the match point.
3. **Winning a Round**:
    - If the player's sum matches the match point and the computer's does not, the player wins the round.
    - If the computer's sum matches the match point and the player's does not, the computer wins the round.
    - If both sums match the match point, it's a tie and both scores increase.
    - If neither sum matches the match point, the round continues.
4. **Winning the Game**: The first player (either the user or the computer) to win three rounds wins the game.

### How to Play
1. **Start the Game**: Run the program and enter your name when prompted.
2. **Get a Match Point**: Choose the option to get a match point.
3. **Roll the Dice**: Choose the option to roll the dice and see the results.
4. **Repeat**: Continue rolling until either the player or the computer wins three rounds.
5. **Quit**: You can quit the game at any time by choosing the quit option.

### Code Structure
- **gameIntro()**: Displays the game introduction and rules.
- **letsPlayTxt()**: Displays the initial "Let's Play" message.
- **gameMenu()**: Displays the game menu options.
- **getMatchPoint()**: Randomly selects and displays the match point.
- **randomPick()**: Simulates rolling the dice for both the player and the computer, returning their sums.
- **scoreboard()**: Displays the current scores of the player and the computer.
- **playerWins()**: Updates and displays a message when the player wins a round.
- **cpuWins()**: Updates and displays a message when the computer wins a round.
- **tieWin()**: Updates and displays a message when there's a tie.
- **noWinner()**: Displays a message when no one wins the round.
- **quitGame()**: Displays a message and exits the game.
- **rollAgain()**: Prompts the player to roll again.
- **main()**: Contains the main game loop and handles user input and game flow.

### Usage
To play the game, compile and run the Java program. Follow the on-screen instructions to enter your name, get a match point, roll the dice, and check the scores. Continue playing until either the player or the computer wins three rounds. You can quit the game at any time by selecting the quit option from the menu.

Enjoy playing Lucky Dice!

---

Feel free to adjust the summary to better fit your style or to include additional details specific to your project setup.
