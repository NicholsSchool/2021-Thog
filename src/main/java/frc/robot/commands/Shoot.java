package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.RobotMap;

/* Shooting Sequence

 c1.lTrigger.whenPressed():
    * set robot state such that the driver can't drive
 c1.lTrigger.whileHeld():
    * get data from LimeLight
    * rotate and align robot with target
    * determine distance
    * move foward to known range table
 c1.lTrigger.whenReleased():
    * set robot state such that driver is able to drive
 c1.rTrigger.whenPressed():
    * set robot state such that the driver can't drive
 c1.rTrigger.whileHeld():
    * spin up flywheel to velocity threshold
    * set hood angle (check LL distance)
    * spin ball lift
    * rotate revolver slowly
 c1.rTrigger.whenReleased():
    * cut power to shooter
    * cut power to revolver
    * reset ball lift
    * reset hood
    * set robot state such that driver is able to drive

Edge Cases:
    * What happens when LL doesn't see target?
    * What happens when we want to shoot close?
    * Perhaps rBumper can be reset hood and initiate shooting sequence
    * Perhaps we can get a sonic sensor in fron of the robot?
        ** Prioritize LL distance over sonic sensor in case of obstacles/robots
*/

public class Shoot extends CommandBase {

    public Shoot() {
        addRequirements(RobotContainer.shooter);
    }

    @Override
    public void initialize() {}

    @Override
    public void execute() {
        RobotContainer.shooter.move(RobotMap.SHOOT_SPEED);
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
