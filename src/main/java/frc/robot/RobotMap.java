package frc.robot;

public class RobotMap {

    // Ball Lift
    public static final int BALL_LIFT_ID = 43; //set
    public static final double BALL_LIFT_SPEED = 0.4;
    public static final double BALL_LIFT_RESET_SPEED = 0.1;

    // DriveTrain
    public static final int LEFT_MASTER_ID = 33; //set
    public static final int LEFT_SLAVE_ID = 32; //set
    public static final int RIGHT_MASTER_ID = 34; //set
    public static final int RIGHT_SLAVE_ID = 30; //set
    public static final int SHIFTER_SOLENOID_CHANNEL = 1;
    public static final boolean HIGH_GEAR = false;
    public static final boolean LOW_GEAR = !HIGH_GEAR;
    public static final double GOVERNOR = 1.0; //set

    // General
    public static final int PCM_CAN_ID = 51; //set
    public static final int PDP_CAN_ID = 50; //set

    // Hood
    public static final int HOOD_ID = 42; //set
    public static final double HOOD_SPEED = 0.3;

    // Intake
    public static final int LEFT_INTAKE_ID = 40; //set
    public static final int RIGHT_INTAKE_ID = 41; //set
    public static final int PISTONS_SOLENOID_CHANNEL = 0;
    public static final boolean INTAKE_DOWN = true;
    public static final boolean INTAKE_UP = !INTAKE_DOWN;
    public static final double INTAKE_SPEED = 0.5;

    // Limit Switch
    public static final int LIMIT_SWITCH_ID = 0;

    // Potentiometer
    public static final int POTENTIOMETER_ID = 0;

    // Revolver
    public static final int REVOLVER_ID = 20; //set
    public static final double REVOLVER_SPEED = 0.3;

    // Shooter
    public static final int SHOOTER_ID = 31; //set
    public static final double SHOOT_SPEED = 0.8;

    // Elevator Left: 21
    // Elevator Right: 22

    // Spare Talon: 29
    // Spare SparkMax: 49

}
