package hsn.fan.noenum;

public class CeilingFanNoEnum {
	
	private boolean clockWiseDirection = true;
	private int SpeedCounter = 0;
	
	public void stepSpeedUp() {
		SpeedCounter++;
	}
	
	public void switchDirection() {
		clockWiseDirection = !clockWiseDirection;
	}
	
	public String getCurrentDirection() {
		return clockWiseDirection?"Clock-Wise":"Anti-Clock-Wise";
	}

	public int getCurrentSpeed() {
		return SpeedCounter % 4;
	}
}
