package frc.robot.sensors;

import edu.wpi.first.wpilibj.DigitalInput;
import frc.robot.RobotMap;

public class LimitSwitch {

    private DigitalInput limitSwitch;
    
    public LimitSwitch() {
        limitSwitch = new DigitalInput(RobotMap.LIMIT_SWITCH_ID);
    }

    public boolean get() {
        return !limitSwitch.get();
    }
}
