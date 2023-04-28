//this class contains at least one or more abstract method
//that is why we must make the class abstract
abstract public class Iphone {

	String name;
	int numOfCamera;

	//this is constructor
	//Since the class contains abstract method we cannot make constructor within abstract class
	/*
	 * public Iphone(String name, int numOfCamera) { super(); this.name = name;
	 * this.numOfCamera = numOfCamera; }
	 */

	public void message() {
		System.out.println("This phone has a messaging function");
	}


	//this method does not have any definition "{}"
	//this is why the method has to be an abstract method
	abstract public void display();

}
