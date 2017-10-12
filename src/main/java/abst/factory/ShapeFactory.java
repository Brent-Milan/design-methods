package abst.factory;

public class ShapeFactory extends AbstractFactory {
	
	@Override
	public Shape getShape(String name) {
		if(name == null) {
			return null;
		}
		
		if(name.equalsIgnoreCase("SQUARE")) {
			return new Square();
		} else if(name.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if(name.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}
		
		return null;
	}
	
	@Override
	public Color getColor(String name) {
		return null;
	}
}
