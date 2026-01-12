package day1.browserbuddy;

public class BrowserBuddyApp {

    public static void main(String[] args) {

        BrowserManager manager = new BrowserManager();

        manager.openNewTab("google.com");

        BrowserTab tab = manager.getCurrentTab();
        tab.visit("github.com");
        tab.visit("stackoverflow.com");

        tab.back();
        tab.back();
        tab.forward();

        manager.closeCurrentTab();

        manager.reopenLastClosedTab();
    }
}
