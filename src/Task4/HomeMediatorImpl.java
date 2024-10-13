package Task4;

import java.util.HashMap;
import java.util.Map;

public class HomeMediatorImpl implements HomeMediator {
    private Map<String, Double> sensorData = new HashMap<>();

    public void receiveData(String dataType, double value) {
        sensorData.put(dataType, value);
    }

    public void printReport() {
        System.out.println("Home Sensor Report:");
        for (Map.Entry<String, Double> entry : sensorData.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
