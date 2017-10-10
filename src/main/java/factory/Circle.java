package factory;

public class Circle implements Shape{

	@Override
	public void draw() {
		System.out.println("Console output for draw() within Circle.");
	}
}
