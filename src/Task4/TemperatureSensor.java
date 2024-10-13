package Task4;

public class TemperatureSensor implements Sensor {
    private HomeMediator mediator;
    private double temperature;

    public TemperatureSensor(HomeMediator mediator) {
        this.mediator = mediator;
    }

    public void sendData() {
        // Simulate reading temperature
        temperature = 22.5; // Example value
        mediator.receiveData("Temperature", temperature);
    }
}
