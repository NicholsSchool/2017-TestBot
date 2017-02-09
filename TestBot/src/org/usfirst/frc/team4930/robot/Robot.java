
package org.usfirst.frc.team4930.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.PWM;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team4930.robot.subsystems.AbstractLimitSwitch;
import org.usfirst.frc.team4930.robot.subsystems.PulseWidthRangeFinder;
import org.usfirst.frc.team4930.robot.subsystems.DriveTrain;
import org.usfirst.frc.team4930.robot.subsystems.Pneumatics;
import org.usfirst.frc.team4930.robot.Robot;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	
	//subsystems
	public static OI oi;
	public static DriveTrain driveTrain;
	public static AbstractLimitSwitch abstractLimitSwitch;
	public static Pneumatics pneumatics;

	public void robotInit() {
	  
	  RobotMap.init();
		oi = new OI();
		
		//instantiate subsystems
		driveTrain = new DriveTrain();
		abstractLimitSwitch = new AbstractLimitSwitch();
		pneumatics = new Pneumatics();
	}

	public void disabledInit() {}

	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	public void autonomousInit() {}

	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	public void teleopInit() {
	  RobotMap.compressor.setClosedLoopControl(false);
	}

	public void teleopPeriodic() {
		Scheduler.getInstance().run();
//		SmartDashboard.putNumber("range in inches", RobotMap.ultrasonic.getRangeInInches());
//		SmartDashboard.putNumber("voltage", AnalogRangeFinder.ultrasonic.getVoltage());
//		SmartDashboard.putNumber("value", AnalogRangeFinder.ultrasonic.getValue());
//		SmartDashboard.putNumber("average voltage", AnalogRangeFinder.ultrasonic.getAverageVoltage());
//      SmartDashboard.putNumber("average value", AnalogRangeFinder.ultrasonic.getAverageValue());
//      SmartDashboard.putNumber("encoder velocity", RobotMap.motor.getEncVelocity());
//      SmartDashboard.putNumber("encoder position", RobotMap.motor.getEncPosition());
	}

	public void testInit() {}

	public void testPeriodic() {
		LiveWindow.run();
	}
}
