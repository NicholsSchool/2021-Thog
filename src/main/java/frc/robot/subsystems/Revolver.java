package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;

public class Revolver extends SubsystemBase {
    
    private WPI_TalonSRX revolver;

    public Revolver() {

        revolver = new WPI_TalonSRX(RobotMap.REVOLVER_ID);
        
        revolver.configFactoryDefault();
    }

    public void set(double speed) {

        revolver.set(speed);
    }

    public void stop() {

        revolver.stopMotor();
    }
}
