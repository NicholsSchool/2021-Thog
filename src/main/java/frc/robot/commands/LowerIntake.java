package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;
import frc.robot.RobotContainer;
import frc.robot.RobotMap;

public class LowerIntake extends CommandBase {
    
    public LowerIntake() {

        addRequirements(RobotContainer.intake);
    }

    @Override
    public void initialize() {

        Robot.state.put("INTAKE", "DOWN");
        RobotContainer.intake.setPosition(RobotMap.INTAKE_DOWN);
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
