import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String playAgain;
        do {
            String playerA, playerB;
            do {
                System.out.print("Player A, enter your move (R/P/S): ");
                playerA = in.nextLine();
            } while (!playerA.equalsIgnoreCase("R") && !playerA.equalsIgnoreCase("P") && !playerA.equalsIgnoreCase("S"));
            do {
                System.out.print("Player B, enter your move (R/P/S): ");
                playerB = in.nextLine();
            } while (!playerB.equalsIgnoreCase("R") && !playerB.equalsIgnoreCase("P") && !playerB.equalsIgnoreCase("S"));
            if (playerA.equals(playerB)) {
                System.out.println("It's a Tie!");
            } else if (playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("S")) {
                System.out.println("Rock breaks Scissors - Player A wins!");
            } else if (playerA.equalsIgnoreCase("S") && playerB.equalsIgnoreCase("P")) {
                System.out.println("Scissors cuts Paper - Player A wins!");
            } else if (playerA.equalsIgnoreCase("P") && playerB.equalsIgnoreCase("R")) {
                System.out.println("Paper covers Rock - Player A wins!");
            } else {
                if (playerB.equalsIgnoreCase("R") && playerA.equalsIgnoreCase("S")) {
                    System.out.println("Rock breaks Scissors - Player B wins!");
                } else if (playerB.equalsIgnoreCase("S") && playerA.equalsIgnoreCase("P")) {
                    System.out.println("Scissors cuts Paper - Player B wins!");
                } else if (playerB.equalsIgnoreCase("P") && playerA.equalsIgnoreCase("R")) {
                    System.out.println("Paper covers Rock - Player B wins!");
                }
            }
            System.out.print("Play again? (Y/N): ");
            playAgain = in.nextLine().trim().toLowerCase();
        } while (playAgain.equalsIgnoreCase("Y"));
        System.out.println("Thanks for playing!");
    }
}