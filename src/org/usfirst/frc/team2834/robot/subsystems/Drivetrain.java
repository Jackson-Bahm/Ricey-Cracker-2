package org.usfirst.frc.team2834.robot.subsystems;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private Victor motors[] = {
	    	new Victor(0),
	    	new Victor(1),
	    	new Victor(3),
	    	new Victor(4)
	    };   
	
	 public void setOutput(double left, double right, boolean scaleCenter) {
	    	motors[0].set(left);
	    	motors[1].set(left);
	    	motors[3].set(right);
	    	motors[4].set(right);
	 }
	public void setZero() {
    	setOutput(0, 0, false);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

