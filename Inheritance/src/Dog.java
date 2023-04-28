//this is parent class with two attributes and two methods
public class Dog {
	String name = "tommy";
	int tail = 1;


	public void bark() {
		System.out.println("The dog barks");
	}
	
	public void info() {
		System.out.println("name= "+name);
		System.out.println("tail= "+tail);
	}
}