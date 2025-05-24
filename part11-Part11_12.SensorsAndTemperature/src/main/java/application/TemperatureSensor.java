package application;

import java.util.Random;

// Create a class TemperatureSensor that implements the Sensor interface.

// At first a temperature sensor is off. When the method read is called and the sensor is on, the sensor randomly chooses an integer in the range -30...30 and returns it. If the sensor is off, the method read throws an IllegalStateException.

// Use the ready-made Java class Random to choose the random number. You'll get an integer in the range 0...60 by calling new Random().nextInt(61); — to get a random integer in the range -30...30 you'll have to subtract a suitable number from the random number in the range 0...60.

public class TemperatureSensor implements Sensor{

    private boolean isOn;

    public TemperatureSensor(){
        isOn = false;
    }

    // returns true if the sensor is on
    public boolean isOn(){
        return isOn;
    }
    
    // sets the sensor on
    public void setOn(){
        isOn = true;
    }
    
    // sets the sensor off
    public void setOff(){
        isOn = false;
    }
    
    // returns the value of the sensor if it's on
    // if the sensor is not on throw a IllegalStateException
    public int read(){
        if (!isOn){
            throw new IllegalStateException();
        }
        int randnum = new Random().nextInt(61);
        return randnum - 30;
    }
}
