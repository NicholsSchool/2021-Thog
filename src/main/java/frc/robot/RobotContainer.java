package frc.robot;

import edu.wpi.first.wpilibj.Compressor;
import frc.robot.util.XboxController;
import frc.robot.commands.*;
import frc.robot.sensors.*;
import frc.robot.subsystems.*;
import edu.wpi.first.wpilibj2.command.InstantCommand;

public class RobotContainer {

    // Shorthand Constants
    private static final boolean CW = RobotMap.CLOCKWISE;
    private static final boolean CCW = RobotMap.COUNTER_CLOCKWISE;

    // Controllers
    public static XboxController c0;
    public static XboxController c1;

    // Genearl
    public static Compressor compressor;

    // Subsystems
    public static Flapper flapper;
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

        // Instatiate General Components
        compressor = new Compressor(RobotMap.PCM_CAN_ID);

        // Instatiate Subsystems
        driveTrain = new DriveTrain();
        flapper = new Flapper();
        hood = new Hood();
        intake = new Intake();
        revolver = new Revolver();
        shooter = new Shooter();
        pistons = new Pistons();
        shifter = new Shifter();

        // Instatiate Sensors
        limitSwitch = new LimitSwitch();
        potentiometer = new Potentiometer();

        configureButtonBindings();
    }

    private void configureButtonBindings() {

        // Controllers
        c0 = new XboxController(0);
        c1 = new XboxController(1);

        // Setup Tank Drive
        driveTrain.setDefaultCommand(new Drive());

        // First Controller
        c0.lTrigger.whenPressed(new InstantCommand(() -> pistons.toggle()));
        c0.rTrigger.whileHeld(new RunIntake()); // Possible bad motor
        c0.lBumper.whenPressed(new InstantCommand(() -> shifter.lowGear()));
        c0.rBumper.whenPressed(new InstantCommand(() -> shifter.highGear()));
        c0.a.whenPressed(new InstantCommand(() -> revolver.setDirection(CW)));
        c0.a.whileHeld(new SpinRevolver());
        c0.b.whenPressed(new InstantCommand(() -> revolver.setDirection(CCW)));
        c0.b.whileHeld(new SpinRevolver());

        // Second Controller
        c1.lTrigger.whenPressed(new InstantCommand(() -> driveTrain.disabled()));
        // c1.lTrigger.whileHeld(); // Use Limelight for alignment, distance, etc.
        c1.lTrigger.whenReleased(new InstantCommand(() -> driveTrain.enabled()));
        c1.rTrigger.whenPressed(new ResetHood());
        c1.rTrigger.whileHeld(new CloseShot());
        c1.rTrigger.whenReleased(new ResetFlapper());
        c1.lBumper.whileHeld(new RotateFlapper());
        c1.lBumper.whenReleased(new ResetFlapper());
        c1.rBumper.whileHeld(new SpinShooter());
        c1.y.whenPressed(new ExtendHood());
        c1.x.whenPressed(new RetractHood());
        c1.a.whenPressed(new InstantCommand(() -> revolver.setDirection(CW)));
        c1.a.whileHeld(new SpinRevolver());
        c1.b.whenPressed(new InstantCommand(() -> revolver.setDirection(CCW)));
        c1.b.whileHeld(new SpinRevolver());
    }

    public void getRobotState() {
        Robot.state.put("LS", limitSwitch.get());
        Robot.state.put("Pot", potentiometer.getAngle());
        Robot.state.put("Velocity", shooter.getVelocity());
        System.out.println(Robot.state);
    }
}
