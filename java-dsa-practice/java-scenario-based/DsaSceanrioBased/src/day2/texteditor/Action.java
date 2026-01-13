package day2.texteditor;
class Action {
    String type;   // insert or delete
    String text;

    Action(String type, String text) {
        this.type = type;
        this.text = text;
    }

    @Override
    public String toString() {
        return type + " : \"" + text + "\"";
    }
}
