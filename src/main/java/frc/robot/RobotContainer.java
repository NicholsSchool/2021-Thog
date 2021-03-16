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

        // Instatiate General Components
        compressor = new Compressor(RobotMap.PCM_CAN_ID);

        // Instatiate Subsystems
        driveTrain = new DriveTrain();
        ballLift = new BallLift();
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
        // c0.rTrigger.whileHeld(new TakeIn()); // Possible bad motor
        c0.lBumper.whenPressed(new InstantCommand(() -> shifter.lowGear()));
        c0.rBumper.whenPressed(new InstantCommand(() -> shifter.highGear()));
        c0.a.whileHeld(new Revolve());
        c0.b.whileHeld(new RevolveBackwards());

        // Second Controller
        c1.lTrigger.whenPressed(new InstantCommand(() -> pistons.toggle()));
        c1.rTrigger.whileHeld(new Shoot());
        c1.lBumper.whileHeld(new Lift());
        c1.lBumper.whenReleased(new ResetLift());
        c1.a.whileHeld(new Revolve());
        c1.b.whileHeld(new RevolveBackwards());
        // c1.dpadUp.whileHeld(new Cover());
        // c1.dpadDown.whileHeld(new Uncover());
    }

    public void getRobotState() {
        Robot.state.put("LS", limitSwitch.get());
        Robot.state.put("Pot", potentiometer.get());
        System.out.println(Robot.state);
    }

}
