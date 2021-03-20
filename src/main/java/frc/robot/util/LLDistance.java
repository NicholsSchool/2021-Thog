package frc.robot.util;

import frc.robot.RobotContainer;
import frc.robot.RobotMap;

public class LLDistance {
    
    double A2 = RobotContainer.limelight.getdegVerticalToTarget();

    public double getDistance() {
        return ( (RobotMap.H2 - RobotMap.H1) / Math.tan(RobotMap.A1 + A2) );
    }
}