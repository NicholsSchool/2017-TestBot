package org.usfirst.frc.team4930.robot.commands;

import org.usfirst.frc.team4930.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class LEDon extends Command {
	
	boolean toggle = false;

	protected void initialize() {
		
	}
	
	protected void execute() {
		if (!toggle) {
			Robot.led.On();
			toggle = true;
		} else {
			Robot.led.Off();
			toggle = false;
		}
	}
	
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return true;
	}

	protected void end() {
		
	}
	
	protected void interrupted(){
		
	}
}
