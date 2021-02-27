package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.RobotMap;

public class Shoot extends CommandBase {
    
    @Override
    public void initialize() {}

    @Override
    public void execute() {
        
        RobotContainer.shooter.set(RobotMap.SHOOT_VELOCITY);
    }

    @Override
    public void end(boolean interrupted) {

        RobotContainer.shooter.stop();
    }

    @Override
    public boolean isFinished() {

        return false;
    }
}