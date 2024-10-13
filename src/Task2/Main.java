package Task2;

public class Main {
    public static void main(String[] args) {
        Television tv = new Television();

        Command turnOn = new TurnOnCommand(tv);
        Command turnOff = new TurnOffCommand(tv);
        Command volumeUp = new VolumeUpCommand(tv);
        Command volumeDown = new VolumeDownCommand(tv);
        Command nextChannel = new NextChannelCommand(tv);
        Command previousChannel = new PreviousChannelCommand(tv);

        RemoteControl remote = new RemoteControl();

        // Assigning commands to buttons
        remote.setCommand("PowerOn", turnOn);
        remote.setCommand("PowerOff", turnOff);
        remote.setCommand("VolumeUp", volumeUp);
        remote.setCommand("VolumeDown", volumeDown);
        remote.setCommand("NextChannel", nextChannel);
        remote.setCommand("PreviousChannel", previousChannel);

        // Using the remote control
        remote.pressButton("PowerOn");
        remote.pressButton("VolumeUp");
        remote.pressButton("NextChannel");
        remote.pressButton("NextChannel");
        remote.pressButton("VolumeDown");
        remote.pressButton("PreviousChannel");
        remote.pressButton("PowerOff");
    }
}

