package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.revrobotics.CANSparkMax.IdleMode;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;
import frc.robot.Robot;

public class Flapper extends SubsystemBase {

    private CANSparkMax flapper;
    private int i = 20;

    public Flapper() {
        flapper = new CANSparkMax(RobotMap.FLAPPER_ID, MotorType.kBrushless);
        flapper.restoreFactoryDefaults();
        flapper.setIdleMode(IdleMode.kBrake);
        flapper.setInverted(true);
    }

    public void move(double speed) {
        i = (i > 1) ? i-1 : 1;
        Robot.state.put("F-Speed", i);
        flapper.set(speed/i);
    }

    public void stop() {
        flapper.stopMotor();
        i = 20;
    }
}
