package abst.factory;

public class FactoryApp {

	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryGenerator.getFactory("shape");
		
		//instantiate a Circle
		Shape shape1 = shapeFactory.getShape("circle");
		
		shape1.draw();
		
		//instantiate a Square
		Shape shape2 = shapeFactory.getShape("square");
		
		shape2.draw();
		
		//instantiate a Rectangle
		Shape shape3 = shapeFactory.getShape("rectangle");
		
		shape3.draw();
		
		AbstractFactory colorFactory = FactoryGenerator.getFactory("color");
		
		//instantiate Red
		Color color1 = colorFactory.getColor("red");
		
		color1.fill();
		
		//instantiate Blue
		Color color2 = colorFactory.getColor("blue");
		
		color2.fill();
		
		//instantiate Green
		Color color3 = colorFactory.getColor("green");
		
		color3.fill();

	}

}
