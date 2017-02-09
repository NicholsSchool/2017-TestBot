package org.usfirst.frc.team4930.robot.commands;

import org.usfirst.frc.team4930.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class CompressorOff extends Command {
  protected void initialize() {
  }

  protected void execute() {
    Robot.pneumatics.endCompressing();
  }
  protected boolean isFinished() {
      return false;
  }

  protected void end() {
  }
  
  protected void interrupted() {
  }
}
