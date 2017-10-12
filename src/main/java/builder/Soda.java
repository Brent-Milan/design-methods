package builder;

public class Soda extends ColdDrink {

	@Override
	public String name() {
		return "soda";
	}

	@Override
	public float price() {
		return 30.0f;
	}

}
