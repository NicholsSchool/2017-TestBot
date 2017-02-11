package org.usfirst.frc.team4930.robot.commands;

import org.usfirst.frc.team4930.robot.Robot;
import org.usfirst.frc.team4930.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class EncoderMovement extends Command {

	
	double start;
	double feet;
	double distance;
	 
	protected void initialize() {
		start = RobotMap.motor.getEncPosition();
		feet = 1024;
		distance = (3 * feet) + start;
		
	}
	
	protected void execute() {
		
		while (RobotMap.motor.getEncPosition() <= start) {
			Robot.driveTrain.move(-0.15);
		}
	}
	
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	
	protected void end() {
		Robot.driveTrain.move(0);
	}
	
	protected void interrupted() {
		end();
	}
	
}
