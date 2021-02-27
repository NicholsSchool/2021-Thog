package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;

public class BallLift extends SubsystemBase {

    private CANSparkMax ballLift;

    public BallLift() {

        ballLift = new CANSparkMax(RobotMap.BALL_LIFT_ID, null);
    }

    public void set(double speed) {

        ballLift.set(speed);
    }

    public void stop() {

        ballLift.stopMotor();
    }
}