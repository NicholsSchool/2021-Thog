package frc.robot;

import frc.robot.util.XboxController;
import frc.robot.commands.Drive;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.Intake;

public class RobotContainer {

    public static DriveTrain driveTrain;
    public static Intake intake;

    public static XboxController c0;
    public static XboxController c1;

    public RobotContainer() {
        
        driveTrain = new DriveTrain();
        intake = new Intake();

        configureButtonBindings();
    }
    
    private void configureButtonBindings() {

        c0 = new XboxController(0);
        c1 = new XboxController(1);

        driveTrain.setDefaultCommand(new Drive());
    }
}
