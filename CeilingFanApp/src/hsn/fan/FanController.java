package hsn.fan;

public class FanController {
	
	private final CeilingFan fan;
	
	public FanController(CeilingFan fan) {
		this.fan = fan;
	}
	
	public void pullSpeedCord() {
		fan.stepSpeedUp();
	}

	public void pullDirectionCord() {
		fan.switchDirection();
	}

}
