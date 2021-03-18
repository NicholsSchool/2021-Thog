package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.revrobotics.CANSparkMax.IdleMode;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;

public class Flapper extends SubsystemBase {

    private CANSparkMax ballLift;

    public Flapper() {
        ballLift = new CANSparkMax(RobotMap.FLAPPER_ID, MotorType.kBrushless);
        ballLift.restoreFactoryDefaults();
        ballLift.setIdleMode(IdleMode.kBrake);
        ballLift.setInverted(true);
    }

    public void move(double speed) {
        ballLift.set(speed);
    }

    public void stop() {
        ballLift.stopMotor();
    }
}
