package Task4;

public class Main {
    public static void main(String[] args) {
        HomeMediator mediator = new HomeMediatorImpl();

        Sensor tempSensor = new TemperatureSensor(mediator);
        Sensor humiditySensor = new HumiditySensor(mediator);
        Sensor lightSensor = new LightSensor(mediator);

        // Sensors send data
        tempSensor.sendData();
        humiditySensor.sendData();
        lightSensor.sendData();

        // Print report
        ((HomeMediatorImpl) mediator).printReport();
    }
}

