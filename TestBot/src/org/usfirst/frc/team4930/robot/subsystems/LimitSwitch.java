package org.usfirst.frc.team4930.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class LimitSwitch extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	DigitalInput limitSwitch;
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
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
    
    
    


