/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrain extends SubsystemBase {
  /**
   * Creates a new DriveTrain.
   */

  Talon rf;
  SpeedControllerGroup rfc;
  Talon rb;
  SpeedControllerGroup rbc;
  Talon lb;
  SpeedControllerGroup lbc;
  Talon lf;
  SpeedControllerGroup lfc;

  MecanumDrive drivetrain;

  public DriveTrain() {
   rf = new Talon(1);
   rb = new Talon(2);
   lb = new Talon(3);
   lf = new Talon(4);
   drivetrain = new MecanumDrive(rfc, rbc, lbc, lfc);
  }

  public void MecanumDrive(double x, double y, double rot) {
    drivetrain.driveCartesian(y,x,rot);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
