import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Player p1 = new Player();
        String name = input.nextLine();
        p1.setPlayer(name);
        p1.welcomeMessage();

        Game g1 = new Game();
        int numberOfGames = input.nextInt();
        input.nextLine();
        g1.setNumberOfGames(numberOfGames);
        g1.nextRound();
        g1.declareWinner(name);
    }
}
