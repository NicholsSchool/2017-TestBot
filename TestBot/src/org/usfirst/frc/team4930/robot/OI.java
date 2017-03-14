package org.usfirst.frc.team4930.robot;

import org.usfirst.frc.team4930.robot.commands.ToggleCamera;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator interface to the commands
 * and command groups that allow control of the robot.
 */
public class OI
{
  public Joystick joystick0;

  public JoystickButton joystick0Button1;

  public OI() {
    joystick0 = new Joystick(0);

    joystick0Button1 = new JoystickButton(joystick0, 1);
    joystick0Button1.whenPressed(new ToggleCamera());
  }

  public double getJoystick1() {
    return joystick0.getY();
  }
}
