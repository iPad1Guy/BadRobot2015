package org.usfirst.frc.team1014.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;


public class MikeDriveGroup extends CommandGroup {

	public MikeDriveGroup()
	{
		this.addParallel(new SafeMecanumDriveField());
		this.addParallel(new Grab());
	}
}
