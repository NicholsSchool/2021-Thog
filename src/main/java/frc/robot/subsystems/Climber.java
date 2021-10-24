package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.revrobotics.CANSparkMax.IdleMode;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;

public class Climber extends SubsystemBase {

    private CANSparkMax climber;

    public Climber() {
        climber = new CANSparkMax(RobotMap.CLIMBER_ID, MotorType.kBrushless);
        climber.restoreFactoryDefaults();
        climber.setIdleMode(IdleMode.kBrake);
    }

    public void move(double speed) {
        climber.set(speed);
    }

    public void stop() {
        climber.stopMotor();
    }
}
