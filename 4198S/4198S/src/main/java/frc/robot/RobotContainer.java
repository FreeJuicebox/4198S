
package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
//import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
//import edu.wpi.first.wpilibj2.command.button.Trigger;
//import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.commands.DrivetrainTeleOp;
import frc.robot.subsystems.Drivetrain;


public class RobotContainer {
	private final XboxController mXbox = new XboxController(5);
  private final Joystick leftLogi = new Joystick(0);
  private final Joystick midLogi = new Joystick(1);

	// private final Joystick mJoystick = new Joystick(1);

	private final Drivetrain mDrivetrain = new Drivetrain();


	public RobotContainer() {

		mDrivetrain.setDefaultCommand(new DrivetrainTeleOp(
				mDrivetrain,
				() -> -modifyAxis(leftLogi.getX()) * Drivetrain.MAX_VELOCITY_METERS_PER_SECOND,
				() -> -modifyAxis(leftLogi.getY()) * -Drivetrain.MAX_VELOCITY_METERS_PER_SECOND,
				() -> -modifyAxis(midLogi.getX()) * -Drivetrain.MAX_ANGULAR_VELOCITY_RADIANS_PER_SECOND));
		
// mabe setting mbxbox.getleftx to - inside the () will allow us to flip the orentation. If it bugs out a module try removing the - from the modfiy axis before hand
//if not try maybe doing a - to the drivetrain side? 
		configureBindings();
	}

	private void configureBindings() {

		// mXbox.getBackButton().onTrue(mDrivetrain.zeroGyroscopeCommand());

	
	}

	public Command getAutonomousCommand() {
		return null;
	}

	private static double deadband(double value, double deadband) {
		if (Math.abs(value) > deadband) {
			if (value > 0.0) {
				return (value - deadband) / (1.0 - deadband);
			} else {
				return (value + deadband) / (1.0 - deadband);
			}
		} else {
			return 0.0;
		}
	}

	private static double modifyAxis(double value) {
		// Deadband
		value = deadband(value, 0.1);
		// Square the axis
		value = Math.copySign(value * value, value);

		return value;
	}

	public void zeroGyro() {
		mDrivetrain.zeroGyroscope();
	}


}