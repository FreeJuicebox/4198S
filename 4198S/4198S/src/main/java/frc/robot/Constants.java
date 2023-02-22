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
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;

    
    
  }
  public static final int LEFT_FRONT_DRIVE = 6, // DRIVETRAIN MOTORS
      LEFT_REAR_DRIVE = 4,
      RIGHT_FRONT_DRIVE = 8,
      RIGHT_REAR_DRIVE = 2,
      LEFT_FRONT_STEER = 5,
      LEFT_REAR_STEER = 3,
      RIGHT_FRONT_STEER = 7,
      RIGHT_REAR_STEER = 1;
      public static final int LEFT_FRONT_ENCODER = 11, // CANCODERS
      LEFT_REAR_ENCODER = 10,
      RIGHT_FRONT_ENCODER = 12,
      RIGHT_REAR_ENCODER = 9;

      public static final int MAX_COUNTS_PER_REV = 42;
  public static final double EPSILON = 0.0001;

  public static final double DRIVETRAIN_TRACKWIDTH_METERS = 0.62; // Measure and set trackwidth
  // The front-to-back distance between the drivetrain wheels. Should be measured
  // from center to center.
  public static final double DRIVETRAIN_WHEELBASE_METERS = 0.62; // Measure and set wheelbase

   public static final double LEFT_FRONT_STEER_OFFSET = -Math.toRadians(0); // Measure and set front left steer
                                                                                  // offset
    public static final double LEFT_REAR_STEER_OFFSET = -Math.toRadians(0); // Measure and set front right steer
                                                                                 // offset
    public static final double RIGHT_FRONT_STEER_OFFSET = -Math.toRadians(0); // Measure and set back left steer
                                                                                  // offset
    public static final double RIGHT_REAR_STEER_OFFSET = -Math.toRadians(0); // Measure and set back right steer
                    
}
