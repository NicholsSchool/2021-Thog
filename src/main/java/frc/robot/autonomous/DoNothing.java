package frc.robot.autonomous;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class DoNothing extends CommandBase {

    @Override
    public void initialize() {}

    @Override
    public void execute() {}

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public void end(boolean interrupted) {}
}