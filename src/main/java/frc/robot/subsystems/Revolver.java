package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;

public class Revolver extends SubsystemBase {

    private WPI_TalonSRX revolver;
    private double multiplier = 1.0;

    public Revolver() {
        revolver = new WPI_TalonSRX(RobotMap.REVOLVER_ID);
        revolver.configFactoryDefault();
    }

    public void move(double speed) {
        revolver.set(speed * multiplier);
    }

    public void stop() {
        revolver.stopMotor();
    }

    public void setDirection(boolean direction) {
        if (direction) {
            multiplier = 1.0;
        } else {
            multiplier = -1.0;
        }
    }
}
