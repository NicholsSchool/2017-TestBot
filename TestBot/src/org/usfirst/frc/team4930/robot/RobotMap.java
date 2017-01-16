package org.usfirst.frc.team4930.robot;

import org.usfirst.frc.team4930.robot.subsystems.AbstractLimitSwitch;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  public static AbstractLimitSwitch lim;
  
  public static void init(){
    lim = new AbstractLimitSwitch(0);
    
    if(lim.get()){
      // do something
    }
  }
}
