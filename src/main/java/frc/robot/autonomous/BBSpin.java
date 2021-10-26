package frc.robot.autonomous;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotMap;
import frc.robot.RobotContainer;

public class BBSpin extends CommandBase {
    public double desiredAngle;
    public double speed;

    /**
     * The BBSpin class spins the robot to a desired angle.
     * 
     * @param agl - (double) the angle the robot will rotate to
     * @param spd - (double) the speed the robot will turn
     **/
    public BBSpin(double agl, double spd) {
        desiredAngle = agl;
        speed = spd;
        addRequirements(RobotContainer.driveTrain);
    }

    @Override
    public void initialize() {
        RobotContainer.navX.reset();
    }

    @Override
    public void execute() {
        if (desiredAngle > 0)
            RobotContainer.driveTrain.move(speed, -speed);
        else {
            RobotContainer.driveTrain.move(-speed, speed);
        }
    }

    @Override
    public boolean isFinished() {
        double currentAngle = RobotContainer.navX.getAngle();
        return (currentAngle < desiredAngle + RobotMap.AUTO_TURN_TOLERANCE
                && currentAngle > desiredAngle - RobotMap.AUTO_TURN_TOLERANCE);
    }

    @Override
    public void end(boolean interrupted) {
        RobotContainer.driveTrain.stop();
    }
}