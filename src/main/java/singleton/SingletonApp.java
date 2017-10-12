package singleton;

public class SingletonApp {
	
	public static void main(String[] args) {
		
		//illegal construct
		//Compile Time Error: The constructor SingleObject() is not visible.
		//SingleObject object = new SingleObject();
		
		SingleObject singleObject = SingleObject.getInstance();
		
		//show message
		singleObject.showMessage();
	}

}
