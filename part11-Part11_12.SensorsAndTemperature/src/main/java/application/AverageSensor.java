package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    
    private List<Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor(){
        sensors = new ArrayList<>();
        readings = new ArrayList<>();
    }

    // returns true if the sensor is on
    public boolean isOn(){
        return sensors.stream().allMatch(sensor -> sensor.isOn());
    }
    
    // sets the sensor on
    public void setOn(){
        for (Sensor s : sensors){
            s.setOn();
        }
    }
    
    // sets the sensor off
    public void setOff(){
        for (Sensor s : sensors){
            s.setOff();
        }
    }

    public void addSensor(Sensor toAdd){
        sensors.add(toAdd);
    }
    
    public List<Integer> readings(){
        return readings;
    }

    // returns the value of the sensor if it's on
    // if the sensor is not on throw a IllegalStateException
    public int read(){
        if (isOn() == false || sensors.isEmpty()){
            throw new IllegalStateException();
        }
        int average = sensors.stream().mapToInt(s -> s.read()).sum() / sensors.size();
        readings.add(average);
        return average;
    }
}
