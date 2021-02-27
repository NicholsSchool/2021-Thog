package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Revolver extends SubsystemBase{
    private WPI_TalonSRX revolver;


    public Revolver(){
        revolver = new WPI_TalonSRX (22);
    }


    @Override
    public void periodic(){

    }
}