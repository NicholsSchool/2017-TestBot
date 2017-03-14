package org.usfirst.frc.team4930.robot.commands;

import org.usfirst.frc.team4930.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class PutVideo extends Command
{

  public PutVideo() {
    requires(Robot.camera);
  }

  protected void initialize() {}

  protected void execute() {
    Robot.camera.putVideo();
  }

  protected boolean isFinished() {
    return false;
  }

  protected void end() {}

  protected void interrupted() {
    end();
  }
}
