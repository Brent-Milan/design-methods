package factory;

public class FactoryDesignApp {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		
		//instantiate a Circle using ShapeFactory
		Shape shape1 = shapeFactory.getShape("Circle");
		
		//invoke draw method for Circle
		shape1.draw();
		
		//instantiate a Square using ShapeFactory
		Shape shape2 = shapeFactory.getShape("Square");
		
		//invoke draw method for Square
		shape2.draw();
		
		//instantiate a Rectangle using ShapeFactory
		Shape shape3 = shapeFactory.getShape("Rectangle");
		
		//invoke draw method for Rectangle
		shape3.draw();
	}
}
