package frc.robot;

public class RobotMap {

    // Ball Lift
    public static final int BALL_LIFT_ID = 43;
    public static final double BALL_LIFT_SPEED = 0.4;
    public static final double BALL_LIFT_RESET_SPEED = 0.1;

    // DriveTrain
    public static final int LEFT_MASTER_ID = 33;
    public static final int LEFT_SLAVE_ID = 32;
    public static final int RIGHT_MASTER_ID = 34;
    public static final int RIGHT_SLAVE_ID = 30;
    public static final int SHIFTER_SOLENOID_CHANNEL = 1;
    public static final double GOVERNOR = 1.0;

    // General
    public static final int PCM_CAN_ID = 51;

    // Hood
    public static final int HOOD_ID = 42;
    public static final double HOOD_SPEED = 0.3;

    // Intake
    public static final int LEFT_INTAKE_ID = 40;
    public static final int RIGHT_INTAKE_ID = 41;
    public static final int PISTONS_SOLENOID_CHANNEL = 0;
    public static final double INTAKE_SPEED = 0.5;

    // Revolver
    public static final int REVOLVER_ID = 20;
    public static final double REVOLVER_SPEED = 0.3;

    // Sensors
    public static final int LIMIT_SWITCH_ID = 0;
    public static final int POTENTIOMETER_ID = 0;

    // Shooter
    public static final int SHOOTER_ID = 31;
    public static final double SHOOT_SPEED = 0.8;

    // Elevator Left: CAN #21
    // Elevator Right: CAN #22

    // Spare Talon: CAN #29
    // Spare SparkMax: CAN #49

    // Power Distribution Panel: CAN #50

}
