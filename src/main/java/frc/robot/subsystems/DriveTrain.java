package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;

public class DriveTrain extends SubsystemBase {

    private WPI_TalonFX lMaster;
    private WPI_TalonFX lSlav;

    private WPI_TalonFX rMaster;
    private WPI_TalonFX rSlav;

    private DifferentialDrive drive;
    public boolean enabled = true;

    public DriveTrain() {
        lMaster = new WPI_TalonFX(RobotMap.LEFT_MASTER_ID);
        lSlav = new WPI_TalonFX(RobotMap.LEFT_SLAVE_ID);
        rMaster = new WPI_TalonFX(RobotMap.RIGHT_MASTER_ID);
        rSlav = new WPI_TalonFX(RobotMap.RIGHT_SLAVE_ID);

        lMaster.configFactoryDefault();
        lSlav.configFactoryDefault();
        rMaster.configFactoryDefault();
        rSlav.configFactoryDefault();

        lSlav.follow(lMaster);
        rSlav.follow(rMaster);

        lMaster.setNeutralMode(NeutralMode.Brake);
        lSlav.setNeutralMode(NeutralMode.Brake);
        rMaster.setNeutralMode(NeutralMode.Brake);
        rSlav.setNeutralMode(NeutralMode.Brake);

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

    public void enabled() {
        enabled = true;
    }
    
    public void disabled() {
        enabled = false;
    }
}
