package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.RobotMap;

public class Lift extends CommandBase {
    
    @Override
    public void initialize() {

        addRequirements(RobotContainer.ballLift);
    }

    @Override
    public void execute() {

        RobotContainer.ballLift.set(RobotMap.BALL_LIFT_SPEED);
    }

    @Override
    public void end(boolean interrupted) {

        RobotContainer.ballLift.stop();
    }

    @Override
    public boolean isFinished() {

        return false;
    }
}
