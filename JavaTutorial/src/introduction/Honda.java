package introduction;
import automobile.*;
public class Honda extends Cars {
	
	public void increaseHondaSpeed() {
		Cars c1 = new Cars();
		c1.publicSpeed = 10;
		c1.setPrivateSpeed (10);
		int protectedSpeed = 100;
	}
	

}
