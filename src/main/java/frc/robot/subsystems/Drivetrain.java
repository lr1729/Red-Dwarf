package frc.robot.subsystems;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.Drive;

public class Drivetrain extends Subsystem {

  private static VictorSP leftMasterVictor, rightMasterVictor;
  private static Drivetrain instance;

  private Drivetrain() {
    // initialize VictorSPs
    rightMasterVictor = new VictorSP(0);
    leftMasterVictor = new VictorSP(1);
  }

  // Singleton for getting the instance of the drivetrain
  public static Drivetrain getInstance(){
    if(instance == null){
      instance = new Drivetrain();
    }
    return instance;
  }

  // public funciton to set the speed of the motors
  public void setSpeed(double left, double right){
    leftMasterVictor.setSpeed(left);
    rightMasterVictor.setSpeed(-right);
  }

  // Set default command to drive
  @Override
  protected void initDefaultCommand(){
    setDefaultCommand(new Drive());
  }
  
}
