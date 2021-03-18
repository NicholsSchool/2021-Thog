package frc.robot.sensors;

import edu.wpi.first.wpilibj.AnalogPotentiometer;
import frc.robot.RobotMap;

public class Potentiometer {

    private AnalogPotentiometer potentiometer;
    
    public Potentiometer() {
        potentiometer = new AnalogPotentiometer(RobotMap.POTENTIOMETER_ID);
    }

    public double getAngle() {
        return (int) RobotMap.POTENTIOMETER_TURNS * RobotMap.POTENTIOMETER_DEGREES_PER_TURN * getRoundedValues();
    }

    public double getRoundedValues() {
        return (double) Math.round(getRawValues() * 1000d) / 1000d;
    }

    public double getRawValues() {
        return potentiometer.get();
    }
}
