package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.RobotMap;

public class ShootBall extends CommandBase {
    
    public ShootBall() {
        addRequirements(RobotContainer.shooter);
        addRequirements(RobotContainer.flapper);
        addRequirements(RobotContainer.turntable);
    }

    @Override
    public void initialize() {}

    @Override
    public void execute() {
        RobotContainer.shooter.move(RobotMap.SHOOTER_SPEED);
        if (RobotContainer.shooter.getVelocity() > RobotMap.SHOOTER_MIN_VELOCITY_THRESHOLD) {
            RobotContainer.flapper.move(RobotMap.FLAPPER_SPEED);
            if (RobotContainer.flapper.ready()) {
                RobotContainer.turntable.move(RobotMap.TURNTABLE_SPEED);
            }
        }
    }

    @Override
    public void end(boolean interrupted) {
        RobotContainer.shooter.stop();
        RobotContainer.flapper.stop();
        RobotContainer.turntable.stop();
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
