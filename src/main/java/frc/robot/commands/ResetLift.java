package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.RobotMap;

public class ResetLift extends CommandBase {

    public ResetLift() {
        addRequirements(RobotContainer.ballLift);
    }

    @Override
    public void initialize() {}

    @Override
    public void execute() {
        RobotContainer.ballLift.move(RobotMap.BALL_LIFT_RESET_SPEED);
    }

    @Override
    public void end(boolean interrupted) {
        RobotContainer.ballLift.stop();
    }

    @Override
    public boolean isFinished() {
        return RobotContainer.limitSwitch.get();
    }
}
