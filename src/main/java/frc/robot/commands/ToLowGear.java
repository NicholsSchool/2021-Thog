package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;
import frc.robot.RobotContainer;

public class ToLowGear extends CommandBase {

    public ToLowGear() {
        addRequirements(RobotContainer.driveTrain);
    }

    @Override
    public void initialize() {
        Robot.state.put("HighGear", false);
        RobotContainer.driveTrain.setShifterGear(false);
    }

    @Override
    public void execute() {}

    @Override
    public void end(boolean interrupted) {}

    @Override
    public boolean isFinished() {
        return false;
    }
}
