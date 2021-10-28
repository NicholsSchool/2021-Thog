package frc.robot;

public class RobotMap {

    // Climber
    public static final int CLIMBER_ID = 22; // Talon
    public static final double CLIMBER_SPEED = 1.0;

    // DriveTrain
    public static final int LEFT_MASTER_ID = 33;
    public static final int LEFT_SLAVE_ID = 32;
    public static final int RIGHT_MASTER_ID = 34;
    public static final int RIGHT_SLAVE_ID = 30;
    public static final int SHIFTER_SOLENOID_CHANNEL = 1;
    public static final double GOVERNOR_FAST = 1.0;
    public static final double GOVERNOR_SLOW = 0.8;
    public static double GOVERNOR = GOVERNOR_SLOW;

    // Flapper
    public static final int FLAPPER_ID = 43;
    public static final double FLAPPER_SPEED = 1.0;
    public static final int FLAPPER_LINEAR_VAR = 33;
    public static final double FLAPPER_RESET_SPEED = 0.1;

    // Intake
    public static final int LEFT_INTAKE_ID = 40;
    public static final int RIGHT_INTAKE_ID = 41;
    public static final int PISTONS_SOLENOID_CHANNEL = 0;
    public static final double INTAKE_SPEED = 0.9;

    // Limelight
    public static final double A1 = 33.33; // angle of limelight lens from ground plane
    public static final double H1 = 20.10; // hight from floor to limelight lens
    public static final double H2 = 98.25; // hight from floor to middle of target

    // Pneumatics
    public static final int PCM_CAN_ID = 51;

    // Sensor: Limit Switch
    public static final int LIMIT_SWITCH_ID = 0;

    // Sensor: NavX (DriveTrain Data)
    public static final double METERS_PER_INCH = 0.023;
    public static final double DRIVE_TICKS_PER_REV = 4096;
    public static final double DRIVE_WHEEL_DIAMETER = 6.0; // inches
    public static final double INCHES_PER_TICK = Math.PI * DRIVE_WHEEL_DIAMETER / DRIVE_TICKS_PER_REV;
    public static final double METERS_PER_TICK = INCHES_PER_TICK * METERS_PER_INCH;
    public static final int AUTO_TURN_TOLERANCE = 3;
    public static final double AUTO_DRIVE_TOLERANCE = 3 / INCHES_PER_TICK;

    // Sensor: Potentiometer
    public static final int POTENTIOMETER_ID = 0;
    public static final int POTENTIOMETER_TURNS = 1;
    public static final int POTENTIOMETER_DEGREES_PER_TURN = 270;

    // Shooter
    public static final int SHOOTER_ID = 31;
    public static final double SHOOTER_SPEED = 1.0; 
    public static final int SHOOTER_MIN_VELOCITY_THRESHOLD = 19500; // Top velocity: ~21091

    // Turntable
    public static final int TURNTABLE_ID = 20;
    public static final double TURNTABLE_SPEED = 0.3;
    public static final double CLOCKWISE = 1.0;
    public static final double COUNTER_CLOCKWISE = -1.0;

    // Hood SparkMax: CAN #42
    // Elevator Left: CAN #21
    // Elevator Right: CAN #22
    // Spare Talon: CAN #29
    // Spare SparkMax: CAN #49 // Use for Climber ???
    // Power Distribution Panel: CAN #50

}
