
public class ChildClass extends ParentClass {
	
			int num =20; //this is instance variable "declared in side the class"
			public void dance() {
				int num = 23;   //this is local variable "declared inside the method"
				
				//the following two print statement will be printed twice in the output because the method is called twice using dance(); and this.dance();
				System.out.println(num);
				System.out.println(this.num);
				
				System.out.println("This is child dancing");
			}
			public void hi() {
				dance();
				this.dance();
				super.dance();
				
				
			}
	
	
	public static void main(String[] args) {
		ChildClass  myChild = new ChildClass();
		myChild.hi();

	}

}
