package org.usfirst.frc.team4930.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DigitalInput;

public class AbstractLimitSwitch extends Subsystem {

      private DigitalInput limitSwitch;
      private boolean initial;
      private boolean value;

      public void initDefaultCommand() {}
      
      public AbstractLimitSwitch() {}
      
      public AbstractLimitSwitch(int channel) {
        limitSwitch = new DigitalInput(channel);
        //  instantiating limit switch with channel input
        initial = limitSwitch.get();//t
        //  storing the initial value of limit switch for later comparison to current value
      }
      
      public boolean get(){
        if(initial == limitSwitch.get()){
          return false;
          //  if the current value is equal to the original value, return false
        }
        else {
          return true;
          // if the current value is different than the original value, return true
        }
      }
      
      public boolean getInitial(){
        return initial;
      }
 }
