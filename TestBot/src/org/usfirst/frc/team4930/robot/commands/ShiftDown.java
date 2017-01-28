package org.usfirst.frc.team4930.robot.commands;

import org.usfirst.frc.team4930.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ShiftDown extends Command {

  protected void initialize() {
  }

  protected void execute() {
      Robot.pneumatics.enableLowGear();
  }

  protected boolean isFinished() {
      return true;
  }

  protected void end() {
  }

  protected void interrupted() {
  }
}
