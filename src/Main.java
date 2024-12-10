import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Board board = new Board(100); // Board size of 100 squares

        // Add snakes and ladders
        board.addMover(new Snake(28, 10));
        board.addMover(new Snake(98, 77));
        board.addMover(new Ladder(5, 30));
        board.addMover(new Ladder(15, 47));

        // Prompt for the number of players
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of players: ");
        int numPlayers = scanner.nextInt();

        List<Player> players = new ArrayList<>();
        for (int i = 0; i < numPlayers; i++) {
            System.out.print("Enter the name of player " + (i + 1) + ": ");
            String name = scanner.next();
            players.add(new Player(i + 1, name));
        }

        // Create dice with 1 die
        Dice dice = new Dice(1);

        // Create and start the game
        Game game = new Game(board, players, dice);
        game.startGame();
        scanner.close();
    }
}
