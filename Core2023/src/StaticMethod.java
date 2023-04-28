
class Machine{
	
	void foo() {
		System.out.println("This is a foo from Machine");
	}
	
	static void zee() {
		System.out.println("This is a zee from Machine");
	}
}



public class StaticMethod {

	public static void main(String[] args) {
		
		Machine.zee(); //you don't  make object to call static method
		
		Machine obj = new Machine();
		obj.foo(); //you must make a object to call non-static methods.
		

	}
	
	

}
