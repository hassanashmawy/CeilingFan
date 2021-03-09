package hsn.fan.noenum;

public class FanController {
	
	private final CeilingFanNoEnum fan;
	
	public FanController(CeilingFanNoEnum fan) {
		this.fan = fan;
	}
	
	public void pullSpeedCord() {
		fan.stepSpeedUp();
	}

	public void pullDirectionCord() {
		fan.switchDirection();
	}

}
