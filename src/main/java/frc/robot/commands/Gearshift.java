package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;
import frc.robot.RobotContainer;
import frc.robot.RobotMap;

public class Gearshift extends CommandBase {

    @Override
    public void initialize() {
        if (!((boolean) Robot.state.get("HIGH GEAR"))) {
            Robot.state.put("IS IN HIGH GEAR", true);
            RobotContainer.driveTrain.setShifterGear(RobotMap.HIGH_GEAR);
        }
        else if (((boolean) Robot.state.get("HIGH GEAR"))) {
            Robot.state.put("IS IN HIGH GEAR", false);
            RobotContainer.driveTrain.setShifterGear(RobotMap.LOW_GEAR);
        }
    }

    @Override
    public void execute() {}

    @Override
    public void end(boolean interrupted) {

    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
