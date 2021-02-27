package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;
import frc.robot.RobotContainer;
import frc.robot.RobotMap;

public class RaiseIntake extends CommandBase {
    
    public RaiseIntake() {

        addRequirements(RobotContainer.intake);
    }

    @Override
    public void initialize() {

        Robot.state.put("INTAKE", "UP");
        RobotContainer.intake.setPosition(RobotMap.INTAKE_UP);
    }

    @Override
    public void execute() {}

    @Override
    public void end(boolean interrupted) {

        RobotContainer.intake.stop();
    }

    @Override
    public boolean isFinished() {

        return false;
    }
}
