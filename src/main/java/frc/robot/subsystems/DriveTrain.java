package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;

public class DriveTrain extends SubsystemBase {

    private WPI_TalonFX lMaster;
    private WPI_TalonFX lSlave;

    private WPI_TalonFX rMaster;
    private WPI_TalonFX rSlave;

    private DifferentialDrive drive;
    public boolean enabled = true;

    public DriveTrain() {
        lMaster = new WPI_TalonFX(RobotMap.LEFT_MASTER_ID);
        lSlave = new WPI_TalonFX(RobotMap.LEFT_SLAVE_ID);
        rMaster = new WPI_TalonFX(RobotMap.RIGHT_MASTER_ID);
        rSlave = new WPI_TalonFX(RobotMap.RIGHT_SLAVE_ID);

        lMaster.configFactoryDefault();
        lSlave.configFactoryDefault();
        rMaster.configFactoryDefault();
        rSlave.configFactoryDefault();

        lSlave.follow(lMaster);
        rSlave.follow(rMaster);

        lMaster.setNeutralMode(NeutralMode.Brake);
        lSlave.setNeutralMode(NeutralMode.Brake);
        rMaster.setNeutralMode(NeutralMode.Brake);
        rSlave.setNeutralMode(NeutralMode.Brake);

        drive = new DifferentialDrive(
            new SpeedControllerGroup(lMaster), 
            new SpeedControllerGroup(rMaster)
        );
    }

    public void move(double leftSpeed, double rightSpeed) {
            drive.tankDrive(leftSpeed, rightSpeed);
    }

    public void stop() {
        lMaster.stopMotor();
        rMaster.stopMotor();
    }

    // Resets all encoder values
    public void resetEncoders() {
        lMaster.setSelectedSensorPosition(0);
        rMaster.setSelectedSensorPosition(0);
    }

    /**
     * returns value of left encoder
     * 
     * @return the value of the left encoder
     */
    public double getLeftEncoderValue() {
        return lMaster.getSelectedSensorPosition();
    }

    /**
     * returns value of right encoder
     * 
     * @return the value of the right encoder
     */
    public double getRightEncoderValue() {
        return rMaster.getSelectedSensorPosition();
    }

    // Enable driver control during TeleOp.
    public void enabled() {
        enabled = true;
    }
    
    // Disable driver control during TeleOp.
    public void disabled() {
        enabled = false;
    }
}
