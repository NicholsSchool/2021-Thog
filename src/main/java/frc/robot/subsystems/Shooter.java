package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;

public class Shooter extends SubsystemBase {

    private WPI_TalonFX shooter;

    public Shooter() {

        shooter = new WPI_TalonFX(RobotMap.SHOOTER_ID);
    }

    public void set(double speed) {

        shooter.set(speed);
    }
}
