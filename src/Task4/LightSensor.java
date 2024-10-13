package Task4;

public class LightSensor implements Sensor {
    private HomeMediator mediator;
    private double lightLevel;

    public LightSensor(HomeMediator mediator) {
        this.mediator = mediator;
    }

    public void sendData() {
        // Simulate reading light level
        lightLevel = 300.0; // Example value
        mediator.receiveData("Light Level", lightLevel);
    }
}
