package org.usfirst.frc.team4930.robot;

import edu.wpi.first.wpilibj.Joystick;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  public Joystick joystick1;

  public OI() {
      joystick1 = new Joystick(0);
  }
  
  public double getJoystick1() {
    return joystick1.getY();
  }
}
