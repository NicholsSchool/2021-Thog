package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;

public class AlignToTarget extends CommandBase {

    public AlignToTarget() {
        addRequirements(RobotContainer.driveTrain);
    }

    private double Kp       = -0.013;
    private double spin_rate = 0.195;
    private double spin_min  = 0.085;

    @Override
    public void initialize() {}

    @Override
    public void execute() {
        double heading_error = RobotContainer.limelight.getdegRotationToTarget();
        double heading_adjust = heading_error * Kp;
        if (heading_error > 1.0){
            heading_adjust = heading_adjust - spin_min;
        } else if (heading_error < 1.0) {
            heading_adjust = heading_adjust + spin_min;
        }
        RobotContainer.driveTrain.move(
            spin_rate - heading_adjust,
            spin_rate + heading_adjust
        );
    }

    @Override
    public void end(boolean interrupted) {
        RobotContainer.driveTrain.stop();
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
