package frc.robot;

public class RobotMap {

    // Flapper
    public static final int FLAPPER_ID = 43;
    public static final double FLAPPER_SPEED = 0.4;
    public static final double FLAPPER_RESET_SPEED = 0.1;

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
    public static final int HOOD_MAX_RETRACTED_ANGLE = 90;
    public static final int HOOD_MAX_EXTENDED_ANGLE = 180;
    public static final double HOOD_SPEED = 0.05;

    // Intake
    public static final int LEFT_INTAKE_ID = 40;
    public static final int RIGHT_INTAKE_ID = 41;
    public static final int PISTONS_SOLENOID_CHANNEL = 0;
    public static final double INTAKE_SPEED = 0.5;

    // Revolver
    public static final int REVOLVER_ID = 20;
    public static final double REVOLVER_SPEED = 0.3;
    public static final boolean CLOCKWISE = true;
    public static final boolean COUNTER_CLOCKWISE = !CLOCKWISE;

    // Sensors
    public static final int LIMIT_SWITCH_ID = 0;
    public static final int POTENTIOMETER_ID = 0;
    public static final int POTENTIOMETER_TURNS = 1;
    public static final int POTENTIOMETER_DEGREES_PER_TURN = 270;

    // Shooter
    public static final int SHOOTER_ID = 31;
    public static final double SHOOTER_SPEED = 0.9;
    public static final int SHOOTER_MIN_VELOCITY_THRESHOLD = 1500;

    // Elevator Left: CAN #21
    // Elevator Right: CAN #22

    // Spare Talon: CAN #29
    // Spare SparkMax: CAN #49

    // Power Distribution Panel: CAN #50

}
