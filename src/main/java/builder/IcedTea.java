package builder;

public class IcedTea extends ColdDrink {

	@Override
	public String name() {
		return "iced tea";
	}

	@Override
	public float price() {
		return 30.0f;
	}

}
