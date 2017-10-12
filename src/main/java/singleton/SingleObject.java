package singleton;

public class SingleObject {
	
	public static SingleObject instance = new SingleObject();
	
	//can't be instantiated
	private SingleObject() {}
	
	//returns only instance of object
	public static SingleObject getInstance() {
		return instance;
	}
	
	public void showMessage() {
		System.out.println("Hello, world!");
	}
	
}
