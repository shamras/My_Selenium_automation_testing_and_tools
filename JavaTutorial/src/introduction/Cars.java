package introduction;

public class Cars {
	
	public Cars (int startSpeed) {
		speed = startSpeed;
	}
public Cars() {
		// TODO Auto-generated constructor stub
	}
int speed;
public int publicSpeed;

public void increaseSpeed() {
	speed++;
	System.out.println("increase speed of cars");
	
}
public void decreaseSpeed() {
	speed--;
	System.out.println("decreaseing speed of cars");
}
public void setPrivateSpeed(int i) {
	// TODO Auto-generated method stub
	
}
}
