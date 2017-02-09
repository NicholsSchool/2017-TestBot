package org.usfirst.frc.team4930.robot.commands;

import org.usfirst.frc.team4930.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class CompressorOn extends Command {
    protected void initialize() {
    }

    protected void execute() {
      Robot.pneumatics.startCompressing();
    }
    protected boolean isFinished() {
        return false;
    }

    protected void end() {
      Robot.pneumatics.endCompressing();
    }
    
    protected void interrupted() {
      Robot.pneumatics.endCompressing();
    }
}
