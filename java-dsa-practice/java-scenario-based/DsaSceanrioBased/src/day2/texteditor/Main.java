package day2.texteditor;
public class Main {
    public static void main(String[] args) {

        TextEditor editor = new TextEditor();

        editor.insert("Hello");
        editor.insert(" World");
        editor.showContent();

        editor.delete(6);
        editor.showContent();

        editor.undo();
        editor.showContent();

        editor.undo();
        editor.showContent();

        editor.redo();
        editor.showContent();
    }
}
