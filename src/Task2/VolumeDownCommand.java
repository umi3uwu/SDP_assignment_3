package Task2;

public class VolumeDownCommand implements Command {
    private Television tv;

    public VolumeDownCommand(Television tv) {
        this.tv = tv;
    }

    public void execute() {
        tv.volumeDown();
    }
}

