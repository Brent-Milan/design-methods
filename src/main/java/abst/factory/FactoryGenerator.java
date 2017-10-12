package abst.factory;

public class FactoryGenerator {

	public static AbstractFactory getFactory(String name) {
		if(name.equalsIgnoreCase("shape")) {
			return new ShapeFactory();
		} else if(name.equalsIgnoreCase("color")) {
			return new ColorFactory();
		}
		
		return null;
	}
}
