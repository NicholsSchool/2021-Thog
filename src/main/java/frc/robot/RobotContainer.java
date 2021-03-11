package frc.robot;

import edu.wpi.first.wpilibj.Compressor;
import frc.robot.util.XboxController;
import frc.robot.commands.*;
import frc.robot.sensors.*;
import frc.robot.subsystems.*;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.InstantCommand;

public class RobotContainer {

    public static XboxController c0;
    public static XboxController c1;
    public static DriveTrain driveTrain;

    public static BallLift ballLift;
    public static Hood hood;
    public static Intake intake;
    public static Revolver revolver;
    public static Shooter shooter;
    public static Shifter shifter;

    public static LimitSwitch limitSwitch;
    public static Potentiometer potentiometer;

    public static Compressor compressor;

    public RobotContainer() {
        
        driveTrain = new DriveTrain();
        compressor = new Compressor(RobotMap.PCM_CAN_ID);

        // ballLift = new BallLift();
        // hood = new Hood();
        // intake = new Intake();
        // revolver = new Revolver();
        // shooter = new Shooter();
        shifter = new Shifter();

        configureButtonBindings();
    }
    
    private void configureButtonBindings() {

        c0 = new XboxController(0);
        c1 = new XboxController(1);

        driveTrain.setDefaultCommand(new Drive());

        c0.a.whenActive(new InstantCommand(() -> shifter.highGear(),shifter));
        c0.b.whenActive(new InstantCommand(() -> shifter.lowGear(),shifter));

        // c0.rTrigger.whenPressed(new LowerIntake());
        // c0.rTrigger.whileHeld(new TakeIn());
        // c0.rTrigger.whenReleased(new RaiseIntake());

        // c0.dpadLeft.whileHeld(new RevolveBackwards());
        // c0.dpadRight.whileHeld(new Revolve());

        // c1.lTrigger.whileHeld(new Lift());

        // c1.rTrigger.whileHeld(new Shoot());

        // c1.dpadUp.whileHeld(new Cover());
        // c1.dpadDown.whileHeld(new Uncover());
    }

	public Command getAutonomousCommand() {
		return null;
	}

}