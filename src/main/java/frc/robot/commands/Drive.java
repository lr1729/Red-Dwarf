package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.OI;
import frc.robot.subsystems.Drivetrain;

public class Drive extends Command {

  private OI oi;
  private Drivetrain drivetrain;

  public Drive(){
    oi = OI.getInstance();
    drivetrain = drivetrain.getInstance();
    requires(drivetrain);
  }

  // wheels go brrr
  public void execute(){
    drivetrain.setSpeed(oi.getRightJoy(), oi.getLeftJoy());
  }

  // Can't stop won't stop
  @Override
  protected boolean isFinished(){
    return false;
  }
}
