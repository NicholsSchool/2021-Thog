package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;

public class Shifter extends SubsystemBase {
    
    private Solenoid shifter;

    public Shifter() {
        shifter = new Solenoid(RobotMap.PCM_CAN_ID, RobotMap.SHIFTER_SOLENOID_CHANNEL);
    }

    public void highGear() {
        shifter.set(false);
    }

    public void lowGear() {
        shifter.set(true);
    }
}
