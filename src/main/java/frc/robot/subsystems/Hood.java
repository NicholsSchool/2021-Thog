package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;

public class Hood extends SubsystemBase {
    
    private CANSparkMax hood;

    public Hood() {

        hood = new CANSparkMax(RobotMap.HOOD_ID, MotorType.kBrushless);
        
        hood.restoreFactoryDefaults();
    }

    public void set(double speed) {
        
        hood.set(speed);
    }

    public void stop() {

        hood.stopMotor();
    }
}
