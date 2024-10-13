package Task5;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        editor.addText("Hello, ");
        caretaker.save(editor);

        editor.addText("world!");
        System.out.println("Current text: " + editor.getText());

        caretaker.undo(editor);
        System.out.println("After undo: " + editor.getText());
    }
}