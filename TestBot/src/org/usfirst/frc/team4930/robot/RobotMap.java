package org.usfirst.frc.team4930.robot;

import org.usfirst.frc.team4930.robot.subsystems.AbstractLimitSwitch;
import com.ctre.CANTalon;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  public static CANTalon motor;
  public static AbstractLimitSwitch lim;
  
  public static void init(){
    motor = new CANTalon(1);
    motor.setSafetyEnabled(true);
    motor.setExpiration(0.1);
    
    lim = new AbstractLimitSwitch(1);
    
    if(lim.get() == true){
      motor.set(0.5);
    }
  }
}
