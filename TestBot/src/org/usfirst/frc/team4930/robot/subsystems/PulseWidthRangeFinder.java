package org.usfirst.frc.team4930.robot.subsystems;

import edu.wpi.first.wpilibj.PWM;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class PulseWidthRangeFinder extends Subsystem {
    
    public static PWM ultrasonic;
    
    public void initDefaultCommand() {}
    
    public PulseWidthRangeFinder(int channel) {
      ultrasonic = new PWM(channel);
    }
    
    public double getRaw() {
      return ultrasonic.getRaw();
    }
    
    public double getRangeInInches() {
      return 0.0;
    }
}

