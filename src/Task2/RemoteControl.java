package Task2;
import java.util.HashMap;
import java.util.Map;

public class RemoteControl {
    private Map<String, Command> buttonCommands = new HashMap<>();

    public void setCommand(String button, Command command) {
        buttonCommands.put(button, command);
    }

    public void pressButton(String button) {
        Command command = buttonCommands.get(button);
        if (command != null) {
            command.execute();
        } else {
            System.out.println("No command assigned to button " + button);
        }
    }
}

