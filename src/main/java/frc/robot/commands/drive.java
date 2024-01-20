package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.RomiDrivetrain;

public class drive extends Command{
    int lspeed = 0;
    int rspeed = 0;
    RomiDrivetrain romiDriveTrain;
    public drive(RomiDrivetrain romiDriveTrain,int lspeed,int rspeed){
        this.lspeed = lspeed;
        this.rspeed = rspeed;
        this.romiDriveTrain = romiDriveTrain;
        addRequirements(romiDriveTrain);
    };
    
    @Override
    public void execute(){
        romiDriveTrain.tankdrive(lspeed,rspeed);

    }
    @Override
    public void end(boolean interupted){
         romiDriveTrain.tankdrive(0,0);
    }
    @Override
    public boolean isFinished(){
        return false;
    }
}
