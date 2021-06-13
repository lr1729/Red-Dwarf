package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.DigitalInput;
import frc.robot.OI;
import frc.robot.subsystems.Arm;

public class moveArm extends Command {

    private OI oi;
    private Arm arm;
    DigitalInput armLimitSwitch = new DigitalInput(0);

    //Getting OI and Drivetrain instances to run commands with.
    public moveArm(){
        oi = OI.getInstance();
        arm = Arm.getInstance();
        requires(arm);
    }
    //Execute runs when the robot is active.
    // Here we call the setSpeed function from the Drivetrain Class, using values from the OI class's Joysticks.

    public void execute(){
        if(oi.getLeftButton(1)) {
            arm.setSpeed(-0.25);
        } else if (oi.getLeftButton(2) && armLimitSwitch.get()) {
            arm.setSpeed(0.25);
        }
        else {
            arm.setSpeed(0);
        }
    }
    //We never want this command to stop, so we return false for the abstract isFinished method.
    @Override
    protected boolean isFinished() {

        return false;

    }
}
