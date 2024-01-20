package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.shooterSubsystem;

public class shooter extends Command {
    double speed1;
    double speed2;
    shooterSubsystem shooterSubsystem;
    public shooter(double speed1,double speed2,shooterSubsystem shooterSubsystem){
        this.speed1 = speed1;
        this.speed2 = speed2; 
        this.shooterSubsystem = shooterSubsystem;
    }
    @Override
    public void execute(){
        shooterSubsystem.runShooter(speed1,speed2);

    }
    @Override
    public void end(boolean interupted){
        shooterSubsystem.runShooter(0,0);
    }
    @Override
    public boolean isFinished(){
        return false;
    }
}
