package gamebox;
public class GameBoxApp {

    public static void main(String[] args) {

        Game g1 = new ArcadeGame("Speed Racer", 200, 4.5);
        Game g2 = new StrategyGame("War Tactics", 500, 4.8);

        g1.playDemo();     // Polymorphism
        g2.playDemo();

        g2.applyDiscount(20);   // Operator usage

        User user = new User("Yashraj");
        user.buyGame(g1);
        user.buyGame(g2);

        g1.download();
        g2.download();

        user.showLibrary();
    }
}
