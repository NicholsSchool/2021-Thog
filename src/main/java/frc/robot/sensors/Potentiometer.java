package frc.robot.sensors;

import edu.wpi.first.wpilibj.AnalogPotentiometer;
import frc.robot.RobotMap;

public class Potentiometer {

    private AnalogPotentiometer potentiometer;
    
    public Potentiometer() {
        potentiometer = new AnalogPotentiometer(RobotMap.POTENTIOMETER_ID);
    }

    public double get() {
        return potentiometer.get();
    }
}
