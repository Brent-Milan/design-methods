package builder;

public abstract class Burger implements Item {
	
	@Override
	public Package packaging() {
		return new Wrapper();
	}
	
	@Override
	public abstract float price();
	
}
