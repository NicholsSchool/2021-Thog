package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.RobotMap;

public class ExtendHood extends CommandBase {

    public ExtendHood() {
        addRequirements(RobotContainer.hood);
    }

    @Override
    public void initialize() {}

    @Override
    public void execute() {
        RobotContainer.hood.move(RobotMap.HOOD_SPEED);
    }

    @Override
    public void end(boolean interrupted) {
        RobotContainer.hood.stop();
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
