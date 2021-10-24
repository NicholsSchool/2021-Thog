package frc.robot;

import edu.wpi.first.wpilibj.Compressor;
import frc.robot.util.*;
import frc.robot.commands.*;
import frc.robot.sensors.*;
import frc.robot.subsystems.*;
import edu.wpi.first.wpilibj2.command.InstantCommand;

public class RobotContainer {

    // Shorthand Constants
    private static final double CW = RobotMap.CLOCKWISE;
    private static final double CCW = RobotMap.COUNTER_CLOCKWISE;

    // Controllers
    public static XboxController c0;
    public static XboxController c1;

    // Genearl
    public static Compressor compressor;

    // Subsystems
    public static Flapper flapper;
    public static DriveTrain driveTrain;
    public static Intake intake;
    public static Pistons pistons;
    public static Turntable turntable;
    public static Shifter shifter;
    public static Shooter shooter;

    // Sensors
    public static LimitSwitch limitSwitch;

    // Limelight
    public static LimeLight limelight;
    public static LLUtils llutils; // Limelight Utility Functions

    public RobotContainer() {

        // Instatiate General Components
        compressor = new Compressor(RobotMap.PCM_CAN_ID);

        // Instatiate Subsystems
        driveTrain = new DriveTrain();
        flapper = new Flapper();
        intake = new Intake();
        turntable = new Turntable();
        shooter = new Shooter();
        pistons = new Pistons();
        shifter = new Shifter();

        // Instatiate Sensors
        limitSwitch = new LimitSwitch();
        limelight = new LimeLight();
        llutils = new LLUtils();

        configureButtonBindings();
    }

    private void configureButtonBindings() {

        // Controllers
        c0 = new XboxController(0);
        c1 = new XboxController(1);

        // Setup Default Commands
        driveTrain.setDefaultCommand(new Drive());
        flapper.setDefaultCommand(new ResetFlapper());

        // First Controller
        c0.lTrigger.whenPressed(new InstantCommand(() -> pistons.toggle()));
        c0.rTrigger.whileHeld(new RunIntake());
        c0.lBumper.whenPressed(new InstantCommand(() -> shifter.lowGear()));
        c0.rBumper.whenPressed(new InstantCommand(() -> shifter.highGear()));
        c0.a.whenPressed(new InstantCommand(() -> turntable.setDirection(CW)));
        c0.a.whileHeld(new SpinTurntable());
        c0.b.whenPressed(new InstantCommand(() -> turntable.setDirection(CCW)));
        c0.b.whileHeld(new SpinTurntable());

        // Second Controller
        c1.lTrigger.whenPressed(new InstantCommand(() -> driveTrain.disabled()));
        c1.lTrigger.whileHeld(new TargetAlign());
        c1.lTrigger.whenReleased(new InstantCommand(() -> driveTrain.enabled()));
        c1.rTrigger.whileHeld(new CloseShot());
        c1.lBumper.whileHeld(new RotateFlapper());
        c1.rBumper.whileHeld(new SpinShooter());
        c1.a.whenPressed(new InstantCommand(() -> turntable.setDirection(CW)));
        c1.a.whileHeld(new SpinTurntable());
        c1.b.whenPressed(new InstantCommand(() -> turntable.setDirection(CCW)));
        c1.b.whileHeld(new SpinTurntable());
    }

    public void getRobotState() {
        // Robot.state.put("LS", limitSwitch.get());
        // Robot.state.put("V", shooter.getVelocity());
        // Robot.state.put("LL-XA", llutils.getXtoTarget());
        // Robot.state.put("LL-YA", llutils.getYtoTarget());
        Robot.state.put("LL-Dist", llutils.getDistanceRounded());
        System.out.println(Robot.state);
    }
}
