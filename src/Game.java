import java.util.Scanner;

public class Game {
    private boolean playAgain = false;
    private String playAgainIntent;
    private int timesPlay;
    private int playerScore;
    private int computerScore;
    private int playerChoice;
    private int computerChoice;
    private int Rock = 0;
    private int Paper = 1;
    private int Scissors = 2;
    private int totalRounds;

    public Game() {
        System.out.println("How many games would you like to play?");
    }

    public void setNumberOfGames(int timesPlay) {
        this.timesPlay = timesPlay;
    }

    public void selectionMessage() {
        System.out.println("Pick Rock, Paper, Scissors");
    }

    public void setPlayerChoice(String playerSelected) {
        switch(playerSelected.toUpperCase()) {
            case "ROCK":
                this.playerChoice = 0;
                break;
            case "PAPER":
                this.playerChoice = 1;
                break;
            case "SCISSORS":
                this.playerChoice = 2;
                break;
            default:
                invalidPlayerSelection();
        }
    }

    public void invalidPlayerSelection() {
        System.out.println("Please Select Rock, Paper, or Scissors");
        Scanner input = new Scanner(System.in);
        String newValue = input.nextLine();
        setPlayerChoice(newValue);
    }

    public void computerSelection() {
        this.computerChoice = (int)(Math.random() * 3);
        if (computerChoice == Rock) {
            System.out.println("The Computer picked: Rock");
        } else if (computerChoice == Paper) {
            System.out.println("The Computer picked: Paper");
        } else {
            System.out.println("The Computer picked: Scissors");
        }
    }

    public void gamePlay() {
        if (playerChoice == Rock) {
            if (computerChoice == Paper) {
                System.out.println("Computer Wins!");
                computerScore++;
            } else if(computerChoice == Scissors) {
                System.out.println("Player Wins!");
                playerScore++;
            } else {
                System.out.println("TIE!!");
            }
        } else if (playerChoice == Paper) {
            if (computerChoice == Rock) {
                System.out.println("Player Wins!");
                playerScore++;
            } else if(computerChoice == Scissors) {
                System.out.println("Computer Wins!");
                computerScore++;
            } else {
                System.out.println("TIE!!");
            }
        } else if (playerChoice == Scissors) {
            if (computerChoice == Rock) {
                System.out.println("Computer Wins!");
                computerScore++;
            } else if(computerChoice == Paper) {
                System.out.println("Player Wins!");
                playerScore++;
            } else {
                System.out.println("TIE!!");
            }
        }
    }

    public void nextRound() {
        this.totalRounds = playerScore + computerScore;
        if (totalRounds < timesPlay) {
            selectionMessage();
            Scanner input = new Scanner(System.in);
            String newValue = input.nextLine();
            setPlayerChoice(newValue);
            computerSelection();
            gamePlay();
            System.out.println("Player Wins: " + playerScore + " " + "Computer Wins: " + computerScore);
            nextRound();
        }
    }

    public void declareWinner(String playerName) {
        if (playerScore > computerScore) {
            System.out.println(playerName + " Wins The Game!!!");
        } else {
            System.out.print("Computer Wins The Game!!!");
        }
    }

}
