package day2.texteditor;
import java.util.Stack;

class TextEditor {

    private String content = "";
    private Stack<Action> undoStack = new Stack<>();
    private Stack<Action> redoStack = new Stack<>();

    // Insert text
    public void insert(String text) {
        content += text;
        undoStack.push(new Action("insert", text));
        redoStack.clear(); // clear redo on new action
        System.out.println("Inserted: " + text);
    }

    // Delete text
    public void delete(int length) {
        if (length > content.length()) return;

        String removed = content.substring(content.length() - length);
        content = content.substring(0, content.length() - length);
        undoStack.push(new Action("delete", removed));
        redoStack.clear();
        System.out.println("Deleted: " + removed);
    }

    // Undo last action
    public void undo() {
        if (undoStack.isEmpty()) {
            System.out.println("Nothing to undo");
            return;
        }

        Action action = undoStack.pop();

        if (action.type.equals("insert")) {
            content = content.substring(0, content.length() - action.text.length());
        } else if (action.type.equals("delete")) {
            content += action.text;
        }

        redoStack.push(action);
        System.out.println("Undo: " + action);
    }

    // Redo last undone action
    public void redo() {
        if (redoStack.isEmpty()) {
            System.out.println("Nothing to redo");
            return;
        }

        Action action = redoStack.pop();

        if (action.type.equals("insert")) {
            content += action.text;
        } else if (action.type.equals("delete")) {
            content = content.substring(0, content.length() - action.text.length());
        }

        undoStack.push(action);
        System.out.println("Redo: " + action);
    }

    // Display current content
    public void showContent() {
        System.out.println("Current Text: \"" + content + "\"");
    }
}
