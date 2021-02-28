package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.RobotMap;

public class Revolve extends CommandBase {

    @Override
    public void initialize() {

        addRequirements(RobotContainer.revolver);
    }

    @Override
    public void execute() {
        RobotContainer.revolver.set(RobotMap.REVOLVER_SPEED);
    }

    @Override
    public void end(boolean interrupted) {
        RobotContainer.revolver.stop();
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
