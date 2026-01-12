package day1.browserbuddy;

import java.util.Stack;

public class BrowserManager {

    private BrowserTab currentTab;
    private Stack<BrowserTab> closedTabs;

    public BrowserManager() {
        closedTabs = new Stack<>();
    }

    public void openNewTab(String homepage) {
        currentTab = new BrowserTab(homepage);
        System.out.println("New tab opened with: " + homepage);
    }

    public BrowserTab getCurrentTab() {
        return currentTab;
    }

    public void closeCurrentTab() {
        if (currentTab != null) {
            closedTabs.push(currentTab);
            currentTab = null;
            System.out.println("Tab closed");
        }
    }

    public void reopenLastClosedTab() {
        if (!closedTabs.isEmpty()) {
            currentTab = closedTabs.pop();
            System.out.println("Reopened tab at: " + currentTab.getCurrentPage());
        } else {
            System.out.println("No closed tabs to reopen");
        }
    }
}
