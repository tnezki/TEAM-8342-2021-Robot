// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;




public class DriveTrain extends SubsystemBase {

  WPI_VictorSPX leftFrontMotor;
  WPI_VictorSPX leftBackMotor;
  WPI_VictorSPX rightFrontMotor;
  WPI_VictorSPX rightBackMotor;

  SpeedControllerGroup leftMotors;
  SpeedControllerGroup rightMotors;
  DifferentialDrive drive;
  
  /** Creates a new DriveTrain. */
  public DriveTrain() {

    leftFrontMotor = new WPI_VictorSPX(Constants.kLeftFront);
    leftFrontMotor.setInverted(false);
    leftBackMotor = new WPI_VictorSPX(Constants.kLeftBack);
    leftBackMotor.setInverted(false);
    rightFrontMotor = new WPI_VictorSPX(Constants.kRightFront);
    rightBackMotor.setInverted(false);
    rightBackMotor = new WPI_VictorSPX(Constants.kRightBack);
    rightBackMotor.setInverted(false);

    leftMotors = new SpeedControllerGroup(leftFrontMotor, leftBackMotor);
    rightMotors = new SpeedControllerGroup(rightFrontMotor, rightBackMotor);
    drive = new DifferentialDrive(leftMotors, rightMotors);


  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void driveWithJoysticks (XboxController controller, double speed){

    drive.arcadeDrive(controller.getRawAxis(Constants.XBOX_LEFT_Y_AXIS) * speed, controller.getRawAxis(Constants.XBOX_RIGHT_X_AXIS) * speed);

  }

  public void driveForward (double speed){

    drive.tankDrive(speed, speed);

  }

  public void stop(){

    drive.stopMotor();

  }
}
