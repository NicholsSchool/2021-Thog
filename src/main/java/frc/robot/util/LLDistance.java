package frc.robot.util;

import frc.robot.RobotContainer;
import frc.robot.RobotMap;

public class LLDistance {

    /*
        Documentation: https://docs.limelightvision.io/en/latest/cs_estimating_distance.html
        tan(a1 + a2) = (h2 - h1) / d
        d = (h2 - h1) / Tan(a1 + a2)
    */
    public double getDistance() {
        double A2 = RobotContainer.limelight.getdegVerticalToTarget();
        return ((RobotMap.H2 - RobotMap.H1) / Math.tan(Math.toRadians(RobotMap.A1) + Math.toRadians(A2)));
    }

}
