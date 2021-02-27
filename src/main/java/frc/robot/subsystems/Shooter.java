package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;

public class Shooter extends SubsystemBase {
    private WPI_TalonFX shooter;     
    private boolean isRunning;
    private long startTime;

    
/**
 * Crestes a new Shooter.
 */
    public Shooter() {


        shooter = new WPI_TalonFX(RobotMap.SHOOTER_ID);
        isRunning = false;
        

        shooter.configFactoryDefault();


        shooter.config_kF(0, RobotMap.SHOOTER_F);
        shooter.config_kP(0, RobotMap.SHOOTER_P);
        shooter.config_kI(0, RobotMap.SHOOTER_I);
        shooter.config_kD(0, RobotMap.SHOOTER_D);

        shooter.configOpenloopRamp(RobotMap.SHOOTER_RAMP_TIME);
        shooter.configClosedloopRamp(RobotMap.SHOOTER_RAMP_TIME);
        shooter.configSelectedFeedbackSensor(FeedbackDevice.IntegratedSensor);
        

    
    
    }
    
    

    /**
     * starts the shooter
     */

    public void shoot(){
       //  move(Constants.SHOOTER_SPEED);
       setVelocity(RobotMap.SHOOT_VELOCITY);

    }
    /**
     * moves the shooter.  
     * @param speed
     */

    public void move(double speed) {
        if (! isRunning){
            startTime = System.currentTimeMillis();
            isRunning = true;
        }

        shooter.set(speed);
        if (System.currentTimeMillis() - startTime > RobotMap.SHOOTER_RAMP_TIME * 1000){
        }

    }
     /**
         * stops the shooter's motor.
         */

    public void stop(){
        shooter.stopMotor();
        isRunning = false;
    }

    @Override 
    public void periodic() {

    }

    private void setVelocity(double velocity){
        shooter.set(ControlMode.Velocity, velocity);
        

    }

}
