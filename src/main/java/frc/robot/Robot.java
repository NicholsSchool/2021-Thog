package frc.robot;

import java.util.Hashtable;
import edu.wpi.first.wpilibj.TimedRobot;
// import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;

public class Robot extends TimedRobot {

  public static Hashtable<String, Object> state = new Hashtable<String, Object>();
  private RobotContainer robotContainer;
  // private Command autonomousCommand;

  @Override
  public void robotInit() {
    robotContainer = new RobotContainer();
  }

  @Override
  public void robotPeriodic() {
    CommandScheduler.getInstance().run();
  }

  @Override
  public void autonomousInit() {
    // autonomousCommand = robotContainer.getAutonomousCommand();
    // if (autonomousCommand != null) {
    //     autonomousCommand.schedule();
    // }
  }

  @Override
  public void autonomousPeriodic() {}

  @Override
  public void teleopInit() {}

  @Override
  public void teleopPeriodic() {
    state.put("LS", RobotContainer.limitSwitch.get());
    state.put("Pot", RobotContainer.potentiometer.get());
    state.put("Velocity", RobotContainer.shooter.getVelocity());
    System.out.println(state);
  }

  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  @Override
  public void testInit() {}

  @Override
  public void testPeriodic() {}
}
