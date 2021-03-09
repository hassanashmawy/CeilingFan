package hsn.fan;

public class CeilingFan {
	
	enum Direction {
		CW,ACW
	}
	
	enum Speed {
		OFF, SPEED1, SPEED2, SPEED3
	}
	
	private Direction currentDirection = Direction.CW;
	private Speed currentSpeed = Speed.OFF;
	
	public void stepSpeedUp() {
		switch (currentSpeed) 
        { 
        case OFF: 
        	currentSpeed = Speed.SPEED1 ; 
            break;
        case SPEED1: 
        	currentSpeed = Speed.SPEED2 ; 
            break;
        case SPEED2: 
        	currentSpeed = Speed.SPEED3 ; 
            break;
        case SPEED3: 
        	currentSpeed = Speed.OFF ; 
            break;
        }
	}
	
	public void switchDirection() {
		currentDirection = currentDirection == Direction.CW? currentDirection.ACW:currentDirection.CW;
	}
	
	public Direction getCurrentDirection() {
		return currentDirection;
	}

	public Speed getCurrentSpeed() {
		return currentSpeed;
	}

}
