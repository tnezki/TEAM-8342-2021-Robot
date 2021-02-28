// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    //Drivetrain Motor Locations
	public static final int kLeftFront = 1;
	public static final int kLeftBack = 2;
	public static final int kRightFront = 3;
    public static final int kRightBack = 4;

    //Motor Speed Controls
    public static final double DRIVETRAINSPEED = 0.5;


    //XBOX Button Assignments Note check actually values
    public static final int XBOX_LOCATION = 0;

    public static final int XBOX_LEFT_X_AXIS = 0;
    public static final int XBOX_LEFT_Y_AXIS = 1;
    public static final int XBOX_LEFT_TRIGGER = 2;
    public static final int XBOX_RIGHT_TRIGGER = 3;
    public static final int XBOX_RIGHT_X_AXIS = 4;
    public static final int XBOX_RIGHT_Y_AXIS = 5;

    //Autonomous variables
	public static final double DRIVE_FORWARD_TIME = 3.0;
	public static final double AUTONOMOUS_SPEED = 0.5;
	
	

}
