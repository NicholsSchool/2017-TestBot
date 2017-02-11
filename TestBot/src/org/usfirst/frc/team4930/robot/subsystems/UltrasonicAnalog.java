package org.usfirst.frc.team4930.robot.subsystems;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.command.Subsystem;

public class UltrasonicAnalog extends Subsystem {

	
	public static AnalogInput ultrasonicChannel;
	
	
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	
	}
	public UltrasonicAnalog(int channel) {
		ultrasonicChannel = new AnalogInput(channel);
	}

	
	public double getRaw() {
		return ultrasonicChannel.getAverageVoltage();
	}
	
	public double getInches() {
		return (ultrasonicChannel.getAverageVoltage()/512);
	}
	
	
}
