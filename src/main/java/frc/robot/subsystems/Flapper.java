package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.revrobotics.CANSparkMax.IdleMode;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;

public class Flapper extends SubsystemBase {

    private CANSparkMax flapper;
    private int i;

    public Flapper() {
        flapper = new CANSparkMax(RobotMap.FLAPPER_ID, MotorType.kBrushless);
        flapper.restoreFactoryDefaults();
        flapper.setIdleMode(IdleMode.kBrake);
        flapper.setInverted(true);
        i = RobotMap.FLAPPER_LINEAR_VAR;
    }

    public void move(double speed) {
        i = (i > 1) ? i-1 : 1;
        flapper.set(speed/i);
    }

    public void stop() {
        flapper.stopMotor();
        i = RobotMap.FLAPPER_LINEAR_VAR;
    }

    public boolean ready() {
        if (i == 1) {
            return true;
        } else {
            return false;
        }
    }
}
