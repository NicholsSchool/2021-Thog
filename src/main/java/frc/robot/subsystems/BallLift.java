package frc.robot.subsystems;

import com.revrobotics.SparkMax;

public class BallLift {
    private SparkMax ballLift;
    private double speed;

    public BallLift(){
        ballLift = new SparkMax();      
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