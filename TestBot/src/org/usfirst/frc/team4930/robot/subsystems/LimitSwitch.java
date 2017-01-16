package org.usfirst.frc.team4930.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class LimitSwitch extends Subsystem {

	DigitalInput limitSwitch;
	
    public void initDefaultCommand() {
    }
    
    public LimitSwitch(int port){
    	limitSwitch = new DigitalInput(3);
    }
   
    public boolean get(){ 	
		return limitSwitch.get(); 
    }
    
    public void print(){
    	SmartDashboard.putBoolean("Limit Switch: ", limitSwitch.get());
    }    
}
    
    
    


