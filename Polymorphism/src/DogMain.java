//this program explains that the same method can show
//different behavior at runtime
//this is called polymorphism


public class DogMain {

	public static void main(String[] args) {
		
		Dog myDog = new Dog();
		myDog.bark(); //this will execute from parent class
		
		myDog = new DangerDog();//this is upcasting 
		myDog.bark(); //bark method of DangerDog will be execute
		
		//we can downcast only when we have done upcasting
		DangerDog myNewDog1 = (DangerDog)myDog;//this is downcasting
		myNewDog1.Danger();
		
		myDog = new HappyDog();// this is upcasting 
		myDog.bark(); //bark method of HappyDog will be execute 
		
		//we can downcast only when we have done upcasting
		HappyDog myNewDog2 = (HappyDog)myDog;//this is downcasting
		myNewDog2.happy();
		
		
		

	}

}
