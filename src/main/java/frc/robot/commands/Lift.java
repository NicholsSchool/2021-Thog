package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.RobotMap;

public class Lift extends CommandBase {

    public Lift() {
        
        addRequirements(RobotContainer.ballLift);
    }
    
    @Override
    public void initialize() {}

    @Override
    public void execute() {

        RobotContainer.ballLift.move(RobotMap.BALL_LIFT_SPEED);
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
