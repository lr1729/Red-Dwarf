package frc.robot.subsystems;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Drivetrain extends Subsystem {

  private static VictorSP leftMasterVictor, rightMasterVictor;
  private static Drivetrain instance;

  private Drivetrain() {
    // initialize VictorSPs
    leftMasterVictor = new VictorSP(6);
    leftMasterVictor = new VictorSP(4);
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
    rightMasterVictor.setSpeed(right);
  }

  // Set default command to drive
  @Override
  protected void initDefaultCommand(){
    // setDefaultCommand(new Drive());
  }
  
}
