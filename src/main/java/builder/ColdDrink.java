package builder;

public abstract class ColdDrink implements Item {

	@Override
	public Package packaging() {
		return new Bottle();
	}
	
	@Override
	public abstract float price();
}
