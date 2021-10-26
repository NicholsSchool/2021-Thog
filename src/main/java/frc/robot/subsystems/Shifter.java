package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;

public class Shifter extends SubsystemBase {

    private Solenoid shifter;

    public Shifter() {
        shifter = new Solenoid(RobotMap.PCM_CAN_ID, RobotMap.SHIFTER_SOLENOID_CHANNEL);
        shifter.set(true); // Assuming low gear by default is true
    }

    public void highGear() {
        shifter.set(false);
        RobotMap.GOVERNOR = RobotMap.GOVERNOR_FAST;
    }

    public void lowGear() {
        shifter.set(true);
        RobotMap.GOVERNOR = RobotMap.GOVERNOR_SLOW;
    }
}
