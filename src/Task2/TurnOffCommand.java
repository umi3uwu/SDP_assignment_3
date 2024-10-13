package Task2;
public class TurnOffCommand implements Command {
    private Television tv;

    public TurnOffCommand(Television tv) {
        this.tv = tv;
    }

    public void execute() {
        tv.turnOff();
    }
}

