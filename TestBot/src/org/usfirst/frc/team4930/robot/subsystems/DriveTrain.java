package org.usfirst.frc.team4930.robot.subsystems;


import org.usfirst.frc.team4930.robot.RobotMap;
import org.usfirst.frc.team4930.robot.commands.RunMotor;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {

  public void initDefaultCommand() {
      setDefaultCommand(new RunMotor());
  }
  
  public void move(double speed){
    RobotMap.motor.set(speed);
  }
  
  public void stop(){
    RobotMap.motor.set(0.0);
  }
}