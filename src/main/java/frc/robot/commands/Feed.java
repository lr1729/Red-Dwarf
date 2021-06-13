package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.OI;
import frc.robot.subsystems.Feeder;

public class Feed extends Command {

    private OI oi;
    private Feeder feeder;

    //Getting OI and Drivetrain instances to run commands with.
    public Feed(){
        oi = OI.getInstance();
        feeder = Feeder.getInstance();
        requires(feeder);
    }
    //Execute runs when the robot is active.
    // Here we call the setSpeed function from the Drivetrain Class, using values from the OI class's Joysticks.
    public void execute(){
        if(oi.getRightButton(1)) {
            feeder.setSpeed(1);
        } else if(oi.getRightButton(2)) {
            feeder.setSpeed(-1);
        } else {
            feeder.setSpeed(0);
        }
    }
    //We never want this command to stop, so we return false for the abstract isFinished method.
    @Override
    protected boolean isFinished() {

        return false;

    }
}
