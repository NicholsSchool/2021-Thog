package frc.robot;

import frc.robot.subsystems.BallLift;
import frc.robot.util.XboxController;
import frc.robot.commands.Drive;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.Shooter;
import frc.robot.subsystems.Intake;

public class RobotContainer {

    public static BallLift ballLift;
    public static DriveTrain driveTrain;
    public static Intake intake;
    public static Shooter shooter;

    public static XboxController c0;
    public static XboxController c1;

    public RobotContainer() {
        
        ballLift = new BallLift();
        driveTrain = new DriveTrain();
        intake = new Intake();
        shooter = new Shooter();

        configureButtonBindings();
    }
    
    private void configureButtonBindings() {

        c0 = new XboxController(0);
        c1 = new XboxController(1);

        driveTrain.setDefaultCommand(new Drive());
    }
}