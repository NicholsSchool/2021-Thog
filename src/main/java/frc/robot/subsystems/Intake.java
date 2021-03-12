package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;

public class Intake extends SubsystemBase {
    
    private CANSparkMax lIntake;
    private CANSparkMax rIntake;

    public Intake() {
        lIntake = new CANSparkMax(RobotMap.LEFT_INTAKE_ID, MotorType.kBrushless);
        rIntake = new CANSparkMax(RobotMap.RIGHT_INTAKE_ID, MotorType.kBrushless);
        lIntake.restoreFactoryDefaults();
        rIntake.restoreFactoryDefaults();
        lIntake.setInverted(true);
    }

    public void move(double speed) {
        lIntake.set(speed);
        rIntake.set(speed);
    }

    public void stop() {
        lIntake.stopMotor();
        rIntake.stopMotor();
    }
}
