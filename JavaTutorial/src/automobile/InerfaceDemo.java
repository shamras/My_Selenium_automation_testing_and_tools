package automobile;

public class InerfaceDemo implements CarsInterface, BMWCarsinterface {

	@Override
	public void engineStart(String engineType, boolean isKeyLess) {
		System.out.println("This is the implementation");
		
	}

	@Override
	public void HeadsUpNavigation() {
		System.out.println("This is the headsup navigation");
		
	}

}
