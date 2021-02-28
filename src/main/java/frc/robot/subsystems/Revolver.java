package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;

public class Revolver extends SubsystemBase {
    
    private CANSparkMax revolver;

    public Revolver() {

        revolver = new CANSparkMax(RobotMap.REVOLVER_ID, MotorType.kBrushless);
    }

    public void set(double speed) {
        revolver.set(speed);
    }

    public void stop() {
        revolver.stopMotor();
    }
}
