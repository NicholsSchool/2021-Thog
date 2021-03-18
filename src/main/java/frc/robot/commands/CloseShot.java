package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.RobotMap;

public class CloseShot extends CommandBase {
    
    public CloseShot() {
        addRequirements(RobotContainer.shooter);
        addRequirements(RobotContainer.flapper);
        addRequirements(RobotContainer.revolver);
    }

    @Override
    public void initialize() {}

    @Override
    public void execute() {
        RobotContainer.shooter.move(RobotMap.SHOOTER_SPEED);
        if (RobotContainer.shooter.getVelocity() > RobotMap.SHOOTER_MIN_VELOCITY_THRESHOLD) {
            RobotContainer.flapper.move(RobotMap.FLAPPER_SPEED);
            RobotContainer.revolver.move(RobotMap.REVOLVER_SPEED);
        }
    }

    @Override
    public void end(boolean interrupted) {
        RobotContainer.shooter.stop();
        RobotContainer.flapper.stop();
        RobotContainer.revolver.stop();
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
