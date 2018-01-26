package org.iraiders.robot2018.robot;

import com.analog.adis16448.frc.ADIS16448_IMU;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import org.iraiders.robot2018.robot.commands.OIDrive;

import javax.measure.Measure;
import javax.measure.quantity.Length;
import javax.measure.unit.NonSI;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// Motors
	public static final int frontLeftTalonPort = 1;
	public static final int frontRightTalonPort = 2;
	public static final int backLeftTalonPort = 3;
	public static final int backRightTalonPort = 4;
  public static final int lowerJointTalonPort = 5;
  public static final int upperJointTalonPort = 6;
	
	// Controllers
  public static final int BACKUP_XBOX_PORT = 0;
  public static final int BACKUP_ARCADE_PORT = 1;
  public static final String XBOX_NAME = "Controller (XBOX 360 For Windows)";
  public static final String ARCADE_NAME = "Mayflash Arcade Stick";
	
	// Sensors
  public static final ADIS16448_IMU imu = new ADIS16448_IMU();
  
  // SmartDash Settings
  public static SendableChooser<Integer> startPosition = new SendableChooser<>();
  public static SendableChooser<OIDrive.OIDriveMode> driveMode = new SendableChooser<>();
  
  // Measurements
  public static final Measure<Double, Length> WHEEL_DIAMETER = Measure.valueOf(6d, NonSI.INCH);
  public static final int TICKS_PER_REVOLUTION = 0; // TODO Ticks per Revolution
  
  // Misc
  /**
   * If all else fails, set this to true to enable Minimum Viable Autonomus, which literally only goes forward for a bit
   * For if our sensors are gone, the code is broke, or the robot is on fire
   */
  public static final boolean USE_MINIMUM_VIABLE_AUTO = false;
  
}
