package hsn.fan.noenum;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FanControllerTest {
	
	final String CW = "Clock-Wise";
	final String ACW = "Anti-Clock-Wise";
	
	@Test
	public void test_0CW_NoAction() {
		
		CeilingFanNoEnum fan = new CeilingFanNoEnum();
		FanController fanCon = new FanController(fan);

		assertTrue(fan.getCurrentDirection().contentEquals(CW));
		assertTrue(fan.getCurrentSpeed() == 0);
	}
	
	@Test
	public void test_0CW_4SpeedPulls2SwitchPulls() {
		
		CeilingFanNoEnum fan = new CeilingFanNoEnum();
		FanController fanCon = new FanController(fan);
		
		fanCon.pullSpeedCord();
		fanCon.pullSpeedCord();
		fanCon.pullSpeedCord();
		fanCon.pullSpeedCord();

		fanCon.pullDirectionCord();
		fanCon.pullDirectionCord();

		assertTrue(fan.getCurrentDirection().contentEquals(CW));
		assertTrue(fan.getCurrentSpeed() == 0);
	}
	
	@Test
	public void test_2ACW_6SpeedPulls5SwitchPulls() {
		
		CeilingFanNoEnum fan = new CeilingFanNoEnum();
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

		assertTrue(fan.getCurrentDirection().contentEquals(ACW));
		assertTrue(fan.getCurrentSpeed() == 2);
	}
	
	@Test
	public void test_3CW_3SpeedPulls0SwitchPulls() {
		
		CeilingFanNoEnum fan = new CeilingFanNoEnum();
		FanController fanCon = new FanController(fan);
		
		fanCon.pullSpeedCord();
		fanCon.pullSpeedCord();
		fanCon.pullSpeedCord();

		assertTrue(fan.getCurrentDirection().contentEquals(CW));
		assertTrue(fan.getCurrentSpeed() == 3);
	}
	
	@Test
	public void test_1CW_1SpeedPull2SwitchPulls() {
		
		CeilingFanNoEnum fan = new CeilingFanNoEnum();
		FanController fanCon = new FanController(fan);
		
		fanCon.pullSpeedCord();
		fanCon.pullDirectionCord();
		fanCon.pullDirectionCord();

		assertTrue(fan.getCurrentDirection().contentEquals(CW));
		assertTrue(fan.getCurrentSpeed() == 1);
	}
}
