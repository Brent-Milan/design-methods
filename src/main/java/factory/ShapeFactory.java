package factory;

public class ShapeFactory {

	public Shape getShape(String shapeName) {
		if(shapeName == null) {
			return null;
		}
		
		if(shapeName.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if(shapeName.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if(shapeName.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		
		return null;
	}
}
