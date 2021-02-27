package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Robot;
import frc.robot.RobotMap;

public class Intake extends SubsystemBase {
    
    private CANSparkMax lIntake;
    private CANSparkMax rIntake;

    private Solenoid intakeSolenoid;

    public Intake() {

        lIntake = new CANSparkMax(RobotMap.LEFT_INTAKE_ID, MotorType.kBrushless);
        rIntake = new CANSparkMax(RobotMap.RIGHT_INTAKE_ID, MotorType.kBrushless);

        lIntake.restoreFactoryDefaults();
        rIntake.restoreFactoryDefaults();

        intakeSolenoid = new Solenoid(RobotMap.PCM_CAN_ID, RobotMap.INTAKE_SOLENOID_CHANNEL);
        Robot.state.put("INTAKE", "DOWN");
        intakeSolenoid.set(RobotMap.INTAKE_DOWN);

        /*
            Invert stuff, pt. 2 
        */
    }

    public void move(double speed) {
        lIntake.set(speed);
        rIntake.set(-speed);
    }

    public void stop() {
        lIntake.stopMotor();
        rIntake.stopMotor();
    }

    public void setPosition(boolean setDown) {
        intakeSolenoid.set(setDown);
    }
}
