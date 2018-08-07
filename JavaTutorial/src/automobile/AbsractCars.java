package automobile;

public abstract class AbsractCars {
	private int privateSpeed;
	public int publicSpeed;
	
	
public int protectedSpeed;
	
	int speedLimit = 100 ;
	
	public AbsractCars () {
		this(0);
	}
	
	public AbsractCars(int startSpeed) {
		this.privateSpeed = startSpeed;
	}

	public void setPrivateSpeed(int pSpeed) {
		this.privateSpeed = pSpeed;
	}
	
	public abstract void engineStart(String keytype,int numberOfCyl);
	
	
}
