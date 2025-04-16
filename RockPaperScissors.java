import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] options = {"rock", "paper", "scissors"};
        boolean playAgain = true;

        System.out.println("🎮 Welcome to Rock-Paper-Scissors!");

        while (playAgain) {
            // Get user's move
            System.out.print("\nEnter your move (rock, paper, scissors): ");
            String userMove = scanner.nextLine().toLowerCase();

            // Validate user input
            if (!userMove.equals("rock") && !userMove.equals("paper") && !userMove.equals("scissors")) {
                System.out.println("Invalid move! Please choose rock, paper, or scissors.");
                continue;
            }

            // Get computer's move
            String computerMove = options[random.nextInt(3)];
            System.out.println("Computer chose: " + computerMove);

            // Decide the winner
            if (userMove.equals(computerMove)) {
                System.out.println("It's a draw!");
            } else if ((userMove.equals("rock") && computerMove.equals("scissors")) ||
                       (userMove.equals("paper") && computerMove.equals("rock")) ||
                       (userMove.equals("scissors") && computerMove.equals("paper"))) {
                System.out.println("You win! 🎉");
            } else {
                System.out.println("Computer wins! 💻");
            }

            // Ask if the user wants to play again
            System.out.print("\nDo you want to play again? (yes/no): ");
            String response = scanner.nextLine().toLowerCase();
            if (!response.equals("yes")) {
                playAgain = false;
            }
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}

