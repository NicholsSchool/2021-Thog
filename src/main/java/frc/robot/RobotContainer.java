package frc.robot;

import frc.robot.subsystems.BallLift;
import frc.robot.util.XboxController;
import frc.robot.commands.Cover;
import frc.robot.commands.Drive;
import frc.robot.commands.Lift;
import frc.robot.commands.LowerIntake;
import frc.robot.commands.RaiseIntake;
import frc.robot.commands.Revolve;
import frc.robot.commands.RevolveBackwards;
import frc.robot.commands.Shoot;
import frc.robot.commands.TakeIn;
import frc.robot.commands.ToHighGear;
import frc.robot.commands.ToLowGear;
import frc.robot.commands.Uncover;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.Hood;
import frc.robot.subsystems.Shooter;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.Revolver;

public class RobotContainer {

    public static BallLift ballLift;
    public static DriveTrain driveTrain;
    public static Hood hood;
    public static Intake intake;
    public static Revolver revolver;
    public static Shooter shooter;

    public static XboxController c0;
    public static XboxController c1;

    public RobotContainer() {
        
        ballLift = new BallLift();
        driveTrain = new DriveTrain();
        hood = new Hood();
        intake = new Intake();
        revolver = new Revolver();
        shooter = new Shooter();

        configureButtonBindings();
    }
    
    private void configureButtonBindings() {

        c0 = new XboxController(0);
        c1 = new XboxController(1);

        driveTrain.setDefaultCommand(new Drive());

        c0.lBumper.whenPressed(new ToHighGear());
        c0.lBumper.whenReleased(new ToLowGear());

        c0.rTrigger.whenPressed(new LowerIntake());
        c0.rTrigger.whileHeld(new TakeIn());
        c0.rTrigger.whenReleased(new RaiseIntake());

        c0.dpadLeft.whileHeld(new RevolveBackwards());
        c0.dpadRight.whileHeld(new Revolve());

        c1.lTrigger.whileHeld(new Lift());

        c1.rTrigger.whileHeld(new Shoot());

        c1.dpadUp.whileHeld(new Cover());
        c1.dpadDown.whileHeld(new Uncover());
    }
}