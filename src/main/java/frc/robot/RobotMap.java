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

    // Game Specific
    public static final double GREEN_ZONE_MIN = 0.0;
    public static final double GREEN_ZONE_DISTANCE = 5.0;
    public static final double GREEN_ZONE_MAX = 7.5;
    public static final double YELLOW_ZONE_MIN = 7.5;
    public static final double YELLOW_ZONE_DISTANCE = 10.0;
    public static final double YELLOW_ZONE_MAX = 12.5;
    public static final double BLUE_ZONE_MIN = 12.5;
    public static final double BLUE_ZONE_DISTANCE = 15.0;
    public static final double BLUE_ZONE_MAX = 17.5;
    public static final double RED_ZONE_MIN = 17.5;
    public static final double RED_ZONE_DISTANCE = 20.0;
    public static final double RED_ZONE_MAX = 22.5;

    // Hood
    public static final int HOOD_ID = 42;
    public static final double HOOD_SPEED = 0.05;
    public static final double HOOD_ANGLE_THRESHOLD = 3;
    public static final double HOOD_MAX_RETRACTED_ANGLE = 95;
    public static final double HOOD_ANGLE_GREEN_ZONE = 90; // 5 ft
    public static final double HOOD_ANGLE_YELLOW_ZONE = 75; // 10ft
    public static final double HOOD_ANGLE_BLUE_ZONE = 60; // 15ft
    public static final double HOOD_ANGLE_RED_ZONE = 45; // 20ft
    public static final double HOOD_MAX_EXTENDED_ANGLE = 40;
    public static final double[] HOOD_ANGLE_ARRAY = {
        HOOD_MAX_RETRACTED_ANGLE,
        HOOD_ANGLE_GREEN_ZONE,
        HOOD_ANGLE_YELLOW_ZONE,
        HOOD_ANGLE_BLUE_ZONE,
        HOOD_ANGLE_RED_ZONE,
        HOOD_MAX_EXTENDED_ANGLE
    };

    // Intake
    public static final int LEFT_INTAKE_ID = 40;
    public static final int RIGHT_INTAKE_ID = 41;
    public static final int PISTONS_SOLENOID_CHANNEL = 0;
    public static final double INTAKE_SPEED = 0.9;

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
    public static final double SHOOTER_SPEED = 1.0; // 21091
    public static final int SHOOTER_MIN_VELOCITY_THRESHOLD = 1500;

    // Elevator Left: CAN #21
    // Elevator Right: CAN #22

    // Spare Talon: CAN #29
    // Spare SparkMax: CAN #49

    // Power Distribution Panel: CAN #50

}
