package org.usfirst.frc.team4930.robot;

import org.usfirst.frc.team4930.robot.commands.EncoderMovement;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  public Joystick joystick1;
  public JoystickButton joystick1Button2;
  
  public OI() {
      joystick1 = new Joystick(0);
      
      joystick1Button2 = new JoystickButton(joystick1, 2);
      joystick1Button2.whenPressed(new EncoderMovement());
      
  }
  
  public double getJoystick1() {
    return joystick1.getY();
  }
}
