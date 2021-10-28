package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotMap;
import frc.robot.RobotContainer;

public class GoToSweetSpot extends CommandBase {
    
    public double distance;
    public double speed;

    /**
     * The BBDrive moves the robot forward or backward a desired distance.
     * 
     * @param dst - (double) the distance the robot will move in inches
     * @param spd - (double) the speed the robot will turn (-1.0 to 1.0)
     **/
    public GoToSweetSpot(double dst, double spd) {
        distance = dst;
        speed = spd;
        addRequirements(RobotContainer.driveTrain);
    }

    @Override
    public void initialize() {
        // double ll_dst_to_target = RobotContainer.llutils.getDistanceRounded();
        // double dst = ll_dst_to_target - sweetspot_dst;
        // desiredDistance = dst / RobotMap.INCHES_PER_TICK;
        RobotContainer.driveTrain.resetEncoders();
    }

    @Override
    public void execute() {
        double delta = distance - RobotContainer.driveTrain.getLeftEncoderValue();
        if (delta > 0) {
            RobotContainer.driveTrain.move(speed, speed);
        } else {
            RobotContainer.driveTrain.move(-speed, -speed);
        }
    }

    @Override
    public void end(boolean interrupted) {
        RobotContainer.driveTrain.stop();
    }

    @Override
    public boolean isFinished() {
        double delta = distance - RobotContainer.driveTrain.getLeftEncoderValue();
        return Math.abs(delta) < RobotMap.AUTO_DRIVE_TOLERANCE;
    }
}