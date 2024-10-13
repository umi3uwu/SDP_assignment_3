package Task2;

public class TurnOnCommand implements Command {
    private Television tv;

    public TurnOnCommand(Television tv) {
        this.tv = tv;
    }

    public void execute() {
        tv.turnOn();
    }
}
