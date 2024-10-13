package Task2;

public class Television {
    private int volume = 10;
    private int channel = 1;
    private boolean isOn = false;

    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("Television is turned ON");
        }
    }

    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println("Television is turned OFF");
        }
    }

    public void volumeUp() {
        if (isOn) {
            volume++;
            System.out.println("Volume is at: " + volume);
        }
    }

    public void volumeDown() {
        if (isOn) {
            volume--;
            System.out.println("Volume is at: " + volume);
        }
    }

    public void nextChannel() {
        if (isOn) {
            channel++;
            System.out.println("Channel is at: " + channel);
        }
    }

    public void previousChannel() {
        if (isOn) {
            channel--;
            System.out.println("Channel is at: " + channel);
        }
    }
}
