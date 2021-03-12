package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.RobotMap;

public class RevolveBackwards extends CommandBase {

    public RevolveBackwards() {
        addRequirements(RobotContainer.revolver);
    }

    @Override
    public void initialize() {}

    @Override
    public void execute() {
        RobotContainer.revolver.move(-RobotMap.REVOLVER_SPEED);
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
