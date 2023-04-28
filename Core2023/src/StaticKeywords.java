//this program emphasize on static variable
//static variable keeps overriding 

class HomeTown{
	String pin;
	static String address;
	//this is constructor
	HomeTown(String p, String a){
		pin =p;
		address= a;
	}
	//print method 
	public void print() {
		System.out.println("Pin ="+pin);
		System.out.println("address = "+address);
	}
	
}



public class StaticKeywords {
	public static void main(String[] args) {
		//when class is loaded then static variable 
		//will be initialized with null
		System.out.println(HomeTown.address);
		
		//providing value to the address
		HomeTown.address = "USA";
		System.out.println(HomeTown.address);
		
		
		//creating multiple objects with static and non-static variables
		//here the pin will be stored in different memory as it is non-static
		//but address will share the memory and replaced each time as it is static
		HomeTown home1 = new HomeTown("123", "Usa");
		HomeTown home2 = new HomeTown("113", "America");
		HomeTown home3 = new HomeTown("133", "Nepal");
		
		
		home1.print();
		home2.print();
		home3.print();
		
	}
}
