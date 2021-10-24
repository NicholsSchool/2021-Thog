package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;

public class Turntable extends SubsystemBase {

    private WPI_TalonSRX turntable;
    private double direction = 1.0;

    public Turntable() {
        turntable = new WPI_TalonSRX(RobotMap.TURNTABLE_ID);
        turntable.configFactoryDefault();
        turntable.setNeutralMode(NeutralMode.Brake);
    }

    public void move(double speed) {
        turntable.set(speed * direction);
    }

    public void stop() {
        turntable.stopMotor();
    }

    public void setDirection(double multiplier) {
        direction *= multiplier;
    }
}
