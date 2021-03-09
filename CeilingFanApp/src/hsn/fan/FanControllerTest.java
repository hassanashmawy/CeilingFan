package hsn.fan;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import hsn.fan.CeilingFan.Direction;
import hsn.fan.CeilingFan.Speed;

public class FanControllerTest {
	
	@Test
	public void test_0CW_NoAction() {
		
		CeilingFan fan = new CeilingFan();
		FanController fanCon = new FanController(fan);

		assertTrue(fan.getCurrentDirection() == Direction.CW);
		assertTrue(fan.getCurrentSpeed() == Speed.OFF);
	}
	
	@Test
	public void test_0CW_4SpeedPulls2SwitchPulls() {
		
		CeilingFan fan = new CeilingFan();
		FanController fanCon = new FanController(fan);
		
		fanCon.pullSpeedCord();
		fanCon.pullSpeedCord();
		fanCon.pullSpeedCord();
		fanCon.pullSpeedCord();

		fanCon.pullDirectionCord();
		fanCon.pullDirectionCord();

		assertTrue(fan.getCurrentDirection() == Direction.CW);
		assertTrue(fan.getCurrentSpeed() == Speed.OFF);
	}
	
	@Test
	public void test_2ACW_6SpeedPulls5SwitchPulls() {
		
		CeilingFan fan = new CeilingFan();
		FanController fanCon = new FanController(fan);
		
		fanCon.pullSpeedCord();
		fanCon.pullSpeedCord();
		fanCon.pullSpeedCord();
		fanCon.pullSpeedCord();

		fanCon.pullDirectionCord();
		fanCon.pullDirectionCord();

		fanCon.pullSpeedCord();
		fanCon.pullSpeedCord();

		fanCon.pullDirectionCord();
		fanCon.pullDirectionCord();
		fanCon.pullDirectionCord();

		assertTrue(fan.getCurrentDirection() == Direction.ACW);
		assertTrue(fan.getCurrentSpeed() == Speed.SPEED2);
	}
	
	@Test
	public void test_3CW_3SpeedPulls0SwitchPulls() {
		
		CeilingFan fan = new CeilingFan();
		FanController fanCon = new FanController(fan);
		
		fanCon.pullSpeedCord();
		fanCon.pullSpeedCord();
		fanCon.pullSpeedCord();

		assertTrue(fan.getCurrentDirection() == Direction.CW);
		assertTrue(fan.getCurrentSpeed() == Speed.SPEED3);
	}
	
	@Test
	public void test_1CW_1SpeedPull2SwitchPulls() {
		
		CeilingFan fan = new CeilingFan();
		FanController fanCon = new FanController(fan);
		
		fanCon.pullSpeedCord();
		fanCon.pullDirectionCord();
		fanCon.pullDirectionCord();

		assertTrue(fan.getCurrentDirection() == Direction.CW);
		assertTrue(fan.getCurrentSpeed() == Speed.SPEED1);
	}
}
