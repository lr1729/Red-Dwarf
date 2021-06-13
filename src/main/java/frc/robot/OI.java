package frc.robot;

import edu.wpi.first.wpilibj.Joystick;

public class OI {
  // singleton
  private static OI instance;
  public static OI getInstance() {
    if (instance == null)
      instance = new OI();
      return instance;
  }

  // Initialize joysticks
  private static Joystick leftJoy, rightJoy;

  // Set joystick ports
  private OI(){
    leftJoy = new Joystick(1);
    rightJoy = new Joystick(0);
  }

  public double getLeftJoy() {
    return leftJoy.getY();
  }

  public double getRightJoy() {
    return rightJoy.getY();
  }

  public boolean getRightButton(int x) {
    return rightJoy.getRawButton(x);
  }

  public boolean getLeftButton(int x) {
    return leftJoy.getRawButton(x);
  }
}
