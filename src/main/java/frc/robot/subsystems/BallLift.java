package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class BallLift extends SubsystemBase{
    private CANSparkMax ballLift;
    private double speed;

    public BallLift(){
        ballLift = new CANSparkMax(44, null);
    }

    public void lift(){
        move();
    }

    private void move(){
        ballLift.set(speed);
    }

    public void stop(){
        ballLift.stopMotor();
    }

    @Override
    public void periodic(){

    }
}