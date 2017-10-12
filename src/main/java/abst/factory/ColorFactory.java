package abst.factory;

public class ColorFactory extends AbstractFactory {
	
	@Override
	public Color getColor(String name) {
		if(name == null) {
			return null;
		}
		
		if(name.equalsIgnoreCase("RED")) {
			return new Red();
		} else if (name.equalsIgnoreCase("BLUE")) {
			return new Blue();
		} else if (name.equalsIgnoreCase("GREEN")) {
			return new Green();
		}
		
		return null;
	}
	
	@Override
	public Shape getShape(String name) {
		return null;
	}
}
