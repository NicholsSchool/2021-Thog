package frc.robot.autonomous;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;
import frc.robot.commands.*;

/**
 * A class which creates and lets you choose autonmous routines.
 */
public class AutoPathChooser {

    // Autonomous Constants
    private static final double BB_DRIVE_SPEED = 0.4;
    private static final double BB_DRIVE_DISTANCE = 100;
    private static final int AUTO_DELAY = 5;

    public static CommandBase getCommand() {
        
        if(Robot.auto_shoot) {
                return driveFirstThenShoot();
            } else {
                return delayThenMoveForward();
        }
    }

    private static CommandBase driveFirstThenShoot() {
        return new BBDrive(BB_DRIVE_DISTANCE, BB_DRIVE_SPEED).withTimeout(5)
        .andThen(new AlignToTarget().withTimeout(2))
        .andThen(new ShootBall().withTimeout(5));
    }

    private static CommandBase delayThenMoveForward() {
        return new DoNothing().withTimeout(AUTO_DELAY)
        .andThen(new BBDrive(BB_DRIVE_DISTANCE, BB_DRIVE_SPEED).withTimeout(10));
    }
}