import java.util.Scanner;

public class RockPaperScissors {

    // Method to generate computer choice
    public static String computerChoice() {
        int choice = (int) (Math.random() * 3);

        if (choice == 0)
            return "rock";
        else if (choice == 1)
            return "paper";
        else
            return "scissors";
    }

    // Method to find winner
    public static String findWinner(String user, String computer) {

        if (user.equals(computer))
            return "Draw";

        if (user.equals("rock") && computer.equals("scissors") ||
            user.equals("paper") && computer.equals("rock") ||
            user.equals("scissors") && computer.equals("paper"))
            return "Player";

        return "Computer";
    }

    // Method to calculate stats and percentage
    public static String[][] calculateStats(int playerWins, int computerWins, int games) {
        String[][] stats = new String[2][3];

        double playerPercent = (playerWins * 100.0) / games;
        double computerPercent = (computerWins * 100.0) / games;

        stats[0][0] = "Player";
        stats[0][1] = String.valueOf(playerWins);
        stats[0][2] = String.format("%.2f", playerPercent);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f", computerPercent);

        return stats;
    }

    // Method to display results
    public static void displayResults(String[][] gameResult, String[][] stats) {

        System.out.println("\nGame\tUser\tComputer\tWinner");
        System.out.println("-----------------------------------------");

        for (int i = 0; i < gameResult.length; i++) {
            System.out.println((i + 1) + "\t" +
                    gameResult[i][0] + "\t" +
                    gameResult[i][1] + "\t\t" +
                    gameResult[i][2]);
        }

        System.out.println("\nPlayer\tWins\tWinning %");
        System.out.println("---------------------------");

        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" +
                    stats[i][1] + "\t" +
                    stats[i][2] + "%");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int games = sc.nextInt();
        sc.nextLine();

        String[][] gameResult = new String[games][3];

        int playerWins = 0;
        int computerWins = 0;

        for (int i = 0; i < games; i++) {
            System.out.print("Enter your choice (rock/paper/scissors): ");
            String user = sc.nextLine().toLowerCase();

            String computer = computerChoice();
            String winner = findWinner(user, computer);

            if (winner.equals("Player"))
                playerWins++;
            else if (winner.equals("Computer"))
                computerWins++;

            gameResult[i][0] = user;
            gameResult[i][1] = computer;
            gameResult[i][2] = winner;
        }

        String[][] stats = calculateStats(playerWins, computerWins, games);
        displayResults(gameResult, stats);
    }
}
