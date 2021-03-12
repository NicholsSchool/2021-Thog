package frc.robot;

import edu.wpi.first.wpilibj.Compressor;
import frc.robot.util.XboxController;
import frc.robot.commands.*;
import frc.robot.sensors.*;
import frc.robot.subsystems.*;
import edu.wpi.first.wpilibj2.command.InstantCommand;

public class RobotContainer {

    // Controllers
    public static XboxController c0;
    public static XboxController c1;

    // Genearl
    public static Compressor compressor;

    // Subsystems
    public static BallLift ballLift;
    public static DriveTrain driveTrain;
    public static Hood hood;
    public static Intake intake;
    public static Pistons pistons;
    public static Revolver revolver;
    public static Shifter shifter;
    public static Shooter shooter;

    // Sensors
    public static LimitSwitch limitSwitch;
    public static Potentiometer potentiometer;

    public RobotContainer() {
        
        compressor = new Compressor(RobotMap.PCM_CAN_ID);
        driveTrain = new DriveTrain();
        ballLift = new BallLift();
        hood = new Hood();
        intake = new Intake();
        revolver = new Revolver();
        shooter = new Shooter();
        pistons = new Pistons();
        shifter = new Shifter();

        configureButtonBindings();
    }
    
    private void configureButtonBindings() {

        c0 = new XboxController(0);
        c1 = new XboxController(1);

        driveTrain.setDefaultCommand(new Drive());

        // Controller Zero
        c0.lTrigger.whenActive(new InstantCommand(() -> pistons.toggle())); // 2nd param neccesary?
        // c0.rTrigger.whileHeld(new TakeIn());
        c0.lBumper.whenActive(new InstantCommand(() -> shifter.lowGear(),shifter));
        c0.rBumper.whenActive(new InstantCommand(() -> shifter.highGear(),shifter));
        c0.a.whileHeld(new Revolve());
        c0.b.whileHeld(new RevolveBackwards());

        // Controller One
        c1.lTrigger.whenActive(new InstantCommand(() -> pistons.toggle(),pistons));
        c1.rTrigger.whileHeld(new Shoot());
        c1.lBumper.whileHeld(new Lift());
        c1.a.whileHeld(new Revolve());
        c1.b.whileHeld(new RevolveBackwards());

        // c1.dpadUp.whileHeld(new Cover());
        // c1.dpadDown.whileHeld(new Uncover());
    }

}