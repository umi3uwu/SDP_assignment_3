package Task4;

public class HumiditySensor implements Sensor {
    private HomeMediator mediator;
    private double humidity;

    public HumiditySensor(HomeMediator mediator) {
        this.mediator = mediator;
    }

    public void sendData() {
        // Simulate reading humidity
        humidity = 45.0; // Example value
        mediator.receiveData("Humidity", humidity);
    }
}
