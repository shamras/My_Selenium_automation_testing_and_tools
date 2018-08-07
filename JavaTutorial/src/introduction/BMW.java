package introduction;

public class  BMW extends Cars {
	public BMW(int startSpeed) {
		super(startSpeed);
	}

	@Override
	public void increaseSpeed() {
		
	System.out.println("Increasing speed of bmw");
	}
	
	public void headupDisplayNavigation() {
		System.out.println("BMW specific funcationality");
	}

}
