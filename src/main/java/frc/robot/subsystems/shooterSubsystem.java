package frc.robot.subsystems;


import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class shooterSubsystem extends SubsystemBase{
     CANSparkMax motor1;
     CANSparkMax motor2;

     public shooterSubsystem(){
         motor1 = new CANSparkMax(0,MotorType.kBrushless);
         motor2 = new CANSparkMax(1,MotorType.kBrushless);
     }
     public void runShooter(double speed1,double speed2){
        motor1.set(speed1);
        motor2.set(speed2);
     }
}
