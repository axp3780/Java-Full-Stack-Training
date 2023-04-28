
public class DogMain {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.bark();
		d.info();
		
		//this is calling a subclass CryDog
		//we can call all the methods from parent class
		CryDog newDog = new CryDog();
		newDog.bark();
		newDog.info();
		newDog.cry();
		
		//this is example of super class reference holding object of subclass
		//this is also known as upcasting of reference
		//methods present on Dog can only be called here
		d= new CryDog();
		d.bark();
		d.info();
		

	}

}
