package frc.robot;

public class RobotMap {

    // Flapper
    public static final int FLAPPER_ID = 43;
    public static final double FLAPPER_SPEED = 0.4;
    public static final int FLAPPER_LINEAR_VAR = 20;
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

    // Zone Specific Info
    public static final int GREEN_ZONE_MIN = 0;
    public static final int GREEN_ZONE_MAX = 90;
    public static final int YELLOW_ZONE_MIN = 90;
    public static final int YELLOW_ZONE_MAX = 150;
    public static final int BLUE_ZONE_MIN = 150;
    public static final int BLUE_ZONE_MAX = 210;
    public static final int RED_ZONE_MIN = 210;
    public static final int RED_ZONE_MAX = 270;

    // Known Distances (X marks the spot)
    public static final int GREEN_ZONE_D = 60; // 5ft
    public static final int YELLOW_ZONE_D = 120; // 10ft
    public static final int BLUE_ZONE_D = 180; // 15ft
    public static final int RED_ZONE_D = 240; // 20ft

    // Hood
    public static final int HOOD_ID = 42;
    public static final double HOOD_SPEED = 0.1;
    public static final double HOOD_ANGLE_THRESHOLD = 2;
    public static final int HOOD_POSITION_0 = 269;
    public static final int HOOD_POSITION_1 = 255;
    public static final int HOOD_POSITION_2 = 240;
    public static final int HOOD_POSITION_3 = 225;
    public static final int HOOD_POSITION_4 = 210;
    public static final int HOOD_POSITION_5 = 195;
    public static int[] HOOD_POSITION = {
        HOOD_POSITION_0,
        HOOD_POSITION_1,
        HOOD_POSITION_2,
        HOOD_POSITION_3,
        HOOD_POSITION_4,
        HOOD_POSITION_5
    };

    // Intake
    public static final int LEFT_INTAKE_ID = 40;
    public static final int RIGHT_INTAKE_ID = 41;
    public static final int PISTONS_SOLENOID_CHANNEL = 0;
    public static final double INTAKE_SPEED = 0.9;

    // Limelight
    public static final double A1 = 28.90; // angle of limelight lens from ground plane
    public static final double H1 = 20.10; // hight from floor to limelight lens
    public static final double H2 = 98.25; // hight from floor to middle of target

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
    public static final int SHOOTER_MIN_VELOCITY_THRESHOLD = 19500;

    // Elevator Left: CAN #21
    // Elevator Right: CAN #22

    // Spare Talon: CAN #29
    // Spare SparkMax: CAN #49

    // Power Distribution Panel: CAN #50

}
