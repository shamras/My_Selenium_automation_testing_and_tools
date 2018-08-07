package automobile;

public class AbstractDemoBMW extends AbsractCars {
	
		public void setPrivateSpeed(int speed) {
			super.setPrivateSpeed(10);
		}
	/*	public void engineStart() {
			super.engineStart();
			System.out.println("BMW have keyless entry start");
		}*/
		@Override
		public void engineStart(String keytype, int numberOfCyl) {
		System.out.println("This is the BMW engine start");
			
		}
	}



