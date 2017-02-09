package org.usfirst.frc.team4930.robot;

import org.usfirst.frc.team4930.robot.commands.CompressorOff;
import org.usfirst.frc.team4930.robot.commands.CompressorOn;
import org.usfirst.frc.team4930.robot.commands.ShiftDown;
import org.usfirst.frc.team4930.robot.commands.ShiftUp;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  public Joystick joystick0;
  public JoystickButton joystick0Button1;
  public JoystickButton joystick0Button2; 
  public JoystickButton joystick0Button3; 
  public JoystickButton joystick0Button4; 
  
  public OI() {
      joystick0 = new Joystick(0);

      joystick0Button1 = new JoystickButton(joystick0, 1);
      joystick0Button1.whenPressed(new ShiftUp());

      joystick0Button2 = new JoystickButton(joystick0, 2);
      joystick0Button2.whenPressed(new ShiftDown());
     
      joystick0Button3 = new JoystickButton(joystick0, 3);
      joystick0Button3.whileHeld(new CompressorOn());
      
  }
  
  public double getJoystick0() {
    return joystick0.getY();
  }
}
