package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.RobotMap;

public class Cover extends CommandBase {
    
    @Override
    public void initialize() {

        addRequirements(RobotContainer.hood);
    }

    @Override
    public void execute() {
        
        RobotContainer.hood.set(RobotMap.HOOD_SPEED);
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
