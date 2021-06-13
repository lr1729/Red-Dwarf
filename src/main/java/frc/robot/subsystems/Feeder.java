package frc.robot.subsystems;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.Feed;

public class Feeder extends Subsystem {
    private static Feeder instance;
    public static Feeder getInstance(){
        if(instance == null)
            instance = new Feeder();
        return instance;
    }

    //Initializing all the motor controllers.
    private VictorSP feedVictor;

    private Feeder(){
        feedVictor = new VictorSP(4);
    }

    public void setSpeed (double up){
        feedVictor.setSpeed(up);

    }

    @Override
    protected void initDefaultCommand() {
        setDefaultCommand(new Feed());
    }
}
