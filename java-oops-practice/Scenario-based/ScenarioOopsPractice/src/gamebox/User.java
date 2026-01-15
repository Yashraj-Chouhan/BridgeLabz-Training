package gamebox;
import java.util.*;

class User {

    private String username;
    private List<Game> ownedGames;

    public User(String username) {
        this.username = username;
        this.ownedGames = new ArrayList<>();
    }

    // Controlled access
    public void buyGame(Game game) {
        ownedGames.add(game);
        System.out.println(game.title + " added to " + username + "'s library.");
    }

    public void showLibrary() {
        System.out.println(username + "'s Games:");
        for (Game g : ownedGames) {
            System.out.println("- " + g.title);
        }
    }
}
