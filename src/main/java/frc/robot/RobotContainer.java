package frc.robot;

import frc.robot.util.XboxController;
import frc.robot.commands.*;
import frc.robot.subsystems.*;

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

        Robot.state.put("instatiate", "bindings");

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