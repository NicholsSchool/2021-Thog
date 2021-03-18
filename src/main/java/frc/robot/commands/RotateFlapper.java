package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.RobotMap;

public class RotateFlapper extends CommandBase {

    public RotateFlapper() {
        addRequirements(RobotContainer.flapper);
    }

    @Override
    public void initialize() {}

    @Override
    public void execute() {
        RobotContainer.flapper.move(RobotMap.FLAPPER_SPEED);
    }

    @Override
    public void end(boolean interrupted) {
        RobotContainer.flapper.stop();
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
