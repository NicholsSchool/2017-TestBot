package org.usfirst.frc.team4930.robot.subsystems;

import org.usfirst.frc.team4930.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

public class LED extends Subsystem{

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	
	public void On() {
		RobotMap.LEDSolenoid.set(true);
	}
	
	public void Off() {
		RobotMap.LEDSolenoid.set(false);
	}

}
