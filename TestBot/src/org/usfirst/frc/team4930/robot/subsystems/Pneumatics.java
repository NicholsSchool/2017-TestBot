package org.usfirst.frc.team4930.robot.subsystems;

import org.usfirst.frc.team4930.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Pneumatics extends Subsystem {

  public void initDefaultCommand() {
  }

  public void enableHighGear() {
      RobotMap.doubleSolenoid.set(DoubleSolenoid.Value.kForward);
  }

  public void enableLowGear() {
      RobotMap.doubleSolenoid.set(DoubleSolenoid.Value.kReverse);
  }

  public void startCompressing() {
      RobotMap.compressor.setClosedLoopControl(true);
  }

  public void endCompressing() {
      RobotMap.compressor.setClosedLoopControl(false);
  }
  
}

