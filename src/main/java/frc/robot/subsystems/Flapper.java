package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.revrobotics.CANSparkMax.IdleMode;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;

public class Flapper extends SubsystemBase {

    private CANSparkMax flapper;

    public Flapper() {
        flapper = new CANSparkMax(RobotMap.FLAPPER_ID, MotorType.kBrushless);
        flapper.restoreFactoryDefaults();
        flapper.setIdleMode(IdleMode.kBrake);
        flapper.setInverted(true);
    }

    public void move(double speed) {
        flapper.set(speed);
    }

    public void stop() {
        flapper.stopMotor();
    }
}
