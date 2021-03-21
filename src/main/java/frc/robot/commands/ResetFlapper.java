package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.RobotMap;

public class ResetFlapper extends CommandBase {

    public ResetFlapper() {
        addRequirements(RobotContainer.flapper);
    }

    @Override
    public void initialize() {}

    @Override
    public void execute() {
        if (RobotContainer.limitSwitch.get()) {
            RobotContainer.flapper.stop();
        } else {
            RobotContainer.flapper.move(RobotMap.FLAPPER_RESET_SPEED);
        }
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
