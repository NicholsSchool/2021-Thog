package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Robot;
import frc.robot.RobotMap;

public class DriveTrain extends SubsystemBase {

    private WPI_TalonFX lMaster;
    private WPI_TalonFX lSlav;

    private WPI_TalonFX rMaster;
    private WPI_TalonFX rSlav;

    public static Solenoid shifter;

    private DifferentialDrive drive;

    public DriveTrain() {

        lMaster = new WPI_TalonFX(RobotMap.LEFT_MASTER_ID);
        lSlav = new WPI_TalonFX(RobotMap.LEFT_SLAVE_ID);

        rMaster = new WPI_TalonFX(RobotMap.RIGHT_MASTER_ID);
        rSlav = new WPI_TalonFX(RobotMap.RIGHT_SLAVE_ID);

        shifter = new Solenoid(RobotMap.PCM_CAN_ID, RobotMap.SHIFTER_SOLENOID_CHANNEL);
        Robot.state.put("IS IN HIGH GEAR", false);
        shifter.set(RobotMap.LOW_GEAR);

        lMaster.configFactoryDefault();
        lSlav.configFactoryDefault();

        rMaster.configFactoryDefault();
        rSlav.configFactoryDefault();

        /*
            Invert stuff
        */

        lSlav.follow(lMaster);
        rSlav.follow(rMaster);

        drive = new DifferentialDrive(lMaster, rMaster);
    }

    public void move(double leftSpeed, double rightSpeed) {
        Robot.state.put("leftSpeed", leftSpeed);
        Robot.state.put("rightSpeed", rightSpeed);
        drive.tankDrive(leftSpeed, rightSpeed);
    }

    public void stop() {

        lMaster.stopMotor();
        rMaster.stopMotor();
    }

    public void setShifterGear(boolean isHighGear) {
        shifter.set(isHighGear);
    }
}