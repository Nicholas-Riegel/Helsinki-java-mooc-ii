package application;

// Create a class called StandardSensor that implements the interface Sensor.

// A standard sensor is always on. Calling the methods setOn and setOff have no effect. The StandardSensor must have a constructor that takes one integer parameter. The method call read returns the number that was given to the constructor.

public class StandardSensor implements Sensor{
    
    private int sensorNumber;

    public StandardSensor(int num){
        sensorNumber = num;
    }

    // returns true if the sensor is on
    public boolean isOn(){
        return true;
    }
    
    // sets the sensor on
    public void setOn(){}
    
    // sets the sensor off
    public void setOff(){}
    
    // returns the value of the sensor if it's on
    // if the sensor is not on throw a IllegalStateException
    public int read(){
        if (isOn() == false){
            throw new IllegalStateException();
        }
        return sensorNumber;
    }
}
