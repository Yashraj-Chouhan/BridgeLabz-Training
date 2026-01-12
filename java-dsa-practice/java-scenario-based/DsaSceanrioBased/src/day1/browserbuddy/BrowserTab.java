package day1.browserbuddy;

public class BrowserTab {

    private HistoryNode head;
    private HistoryNode current;

    public BrowserTab(String homepage) {
        head = new HistoryNode(homepage);
        current = head;
    }

    // Visit new page
    public void visit(String url) {
        HistoryNode newNode = new HistoryNode(url);

        current.next = newNode;
        newNode.prev = current;
        current = newNode;

        System.out.println("Visited: " + url);
    }

    // Back operation
    public void back() {
        if (current.prev != null) {
            current = current.prev;
            System.out.println("Back to: " + current.url);
        } else {
            System.out.println("No previous page");
        }
    }

    // Forward operation
    public void forward() {
        if (current.next != null) {
            current = current.next;
            System.out.println("Forward to: " + current.url);
        } else {
            System.out.println("No next page");
        }
    }

    public String getCurrentPage() {
        return current.url;
    }
}
