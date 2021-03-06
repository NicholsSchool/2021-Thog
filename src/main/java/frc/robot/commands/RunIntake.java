package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.RobotMap;

public class RunIntake extends CommandBase {

    public RunIntake() {
        addRequirements(RobotContainer.intake);
    }

    @Override
    public void initialize() {}

    @Override
    public void execute() {
        RobotContainer.intake.move(RobotMap.INTAKE_SPEED);
    }

    @Override
    public void end(boolean interrupted) {
        RobotContainer.intake.stop();
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
