package org.usfirst.frc.team4930.robot;

import org.usfirst.frc.team4930.robot.subsystems.AbstractLimitSwitch;
import org.usfirst.frc.team4930.robot.subsystems.PulseWidthRangeFinder;

import com.ctre.CANTalon;
import com.ctre.CANTalon.FeedbackDevice;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;


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
  public static PulseWidthRangeFinder ultrasonic;
  
  //pneumatics
  public static DoubleSolenoid doubleSolenoid;
  public static Compressor compressor;
  
  public static void init(){
    motor = new CANTalon(1);
    
    motor.setSafetyEnabled(true);
    motor.setExpiration(0.1);
    motor.setFeedbackDevice(FeedbackDevice.QuadEncoder);
    
    //sensors
    ultrasonic = new PulseWidthRangeFinder(0);
    lim = new AbstractLimitSwitch(1);
    
    //pneumatics
    doubleSolenoid = new DoubleSolenoid(50, 0, 1);
    compressor = new Compressor(50);
    }
}
