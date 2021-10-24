package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.RobotMap;

public class SpinTurntable extends CommandBase {

    public SpinTurntable() {
        addRequirements(RobotContainer.turntable);
    }

    @Override
    public void initialize() {}

    @Override
    public void execute() {
        RobotContainer.turntable.move(RobotMap.TURNTABLE_SPEED);
    }

    @Override
    public void end(boolean interrupted) {
        RobotContainer.turntable.stop();
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
