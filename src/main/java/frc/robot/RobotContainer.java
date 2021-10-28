package frc.robot;

import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.Compressor;
import frc.robot.util.*;
import frc.robot.autonomous.*;
import frc.robot.commands.*;
import frc.robot.sensors.*;
import frc.robot.subsystems.*;
import edu.wpi.first.wpilibj2.command.Command;
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

    // Sensors
    public static LimitSwitch limitSwitch;
    public static AHRS ahrs;
    public static NavX navX;

    // Subsystems
    public static Climber climber;
    public static DriveTrain driveTrain;
    public static Flapper flapper;
    public static Intake intake;
    public static Pistons pistons;
    public static Turntable turntable;
    public static Shifter shifter;
    public static Shooter shooter;

    // Limelight
    public static LimeLight limelight;
    public static LLUtils llutils;

    public RobotContainer() {

        // Instatiate General Components
        compressor = new Compressor(RobotMap.PCM_CAN_ID);

        // Instatiate Sensors
        // Sensors must be instantiated before Subsystems for this robot!
        limitSwitch = new LimitSwitch();
        limelight = new LimeLight();
        llutils = new LLUtils();
        navX = new NavX(new AHRS(SPI.Port.kMXP));
        
        // Instatiate Subsystems
        climber = new Climber();
        driveTrain = new DriveTrain();
        flapper = new Flapper();
        intake = new Intake();
        turntable = new Turntable();
        shooter = new Shooter();
        pistons = new Pistons();
        shifter = new Shifter();

        // Instatiate Controllers
        c0 = new XboxController(0);
        c1 = new XboxController(1);

        configureButtonBindings();
    }

    private void configureButtonBindings() {

        // Setup Default Commands
        driveTrain.setDefaultCommand(new Drive());
        flapper.setDefaultCommand(new ResetFlapper());

        // Driver Controller
        c0.rTrigger.whenPressed(new InstantCommand(() -> pistons.toggle()));
        c0.rTrigger.whileHeld(new RunIntake());
        c0.rTrigger.whenReleased(new InstantCommand(() -> pistons.toggle()));
        c0.lTrigger.whenPressed(new InstantCommand(() -> shifter.highGear()));
        c0.lTrigger.whenReleased(new InstantCommand(() -> shifter.lowGear()));

        // Operator Controller
        c1.lTrigger.whenPressed(new InstantCommand(() -> driveTrain.disabled()));
        c1.lTrigger.whileHeld(new AlignToTarget());
        c1.lTrigger.whenReleased(new InstantCommand(() -> driveTrain.enabled()));
        c1.rTrigger.whileHeld(new ShootBall());
        c1.a.whileHeld(new RotateFlapper());
        c1.start.whileHeld(new GoToSweetSpot(80, 0.4));
        c1.y.whileHeld(new Climb());
        c1.lBumper.whenPressed(new InstantCommand(() -> turntable.setDirection(CW)));
        c1.lBumper.whileHeld(new SpinTurntable());
        c1.rBumper.whenPressed(new InstantCommand(() -> turntable.setDirection(CCW)));
        c1.rBumper.whileHeld(new SpinTurntable());
    }

    public void getRobotState() {
        // Robot.state.put("LS", limitSwitch.get());
        // Robot.state.put("V", shooter.getVelocity());
        // Robot.state.put("LL-XA", llutils.getXtoTarget());
        // Robot.state.put("LL-YA", llutils.getYtoTarget());
        Robot.state.put("Auto-Shoot", Robot.auto_shoot);
        Robot.state.put("LL-Target-Acquired", llutils.getIsTargetFound());
        Robot.state.put("LL-Distance-To-Target", llutils.getDistanceRounded());
        System.out.println(Robot.state);
    }

    /**
     * Use this to pass the autonomous command to the main {@link Robot} class.
     *
     * @return the command to run in autonomous
     */
    public Command getAutonomousCommand() {
        return AutoPathChooser.getCommand();
    }
}
