package org.usfirst.frc.team4930.robot;

import org.usfirst.frc.team4930.robot.subsystems.AbstractLimitSwitch;
import org.usfirst.frc.team4930.robot.subsystems.PulseWidthRangeFinder;

import com.ctre.CANTalon;
import com.ctre.CANTalon.FeedbackDevice;


/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  public static CANTalon motor;
  
  //sensors
  public static AbstractLimitSwitch lim;
  //public static PulseWidthRangeFinder ultrasonic;
  
  public static void init(){
    motor = new CANTalon(1);
    
    motor.setSafetyEnabled(true);
    motor.setExpiration(0.1);
    motor.setFeedbackDevice(FeedbackDevice.QuadEncoder);
    
    //sensors
    //ultrasonic = new PulseWidthRangeFinder(0);
    lim = new AbstractLimitSwitch(1);
    }
}
