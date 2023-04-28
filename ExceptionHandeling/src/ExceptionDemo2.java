
public class ExceptionDemo2 {
	
	public static void main(String[] args) {
		
		//this is for null pointer exception
		try {
			String s = null;
			System.out.println(s.length());
		}
		catch (Exception e) {
			//this will print the type of exception 
			System.out.println(e);
		}
		
		System.out.println("The End of the Program");
	}

}

///////These are the types of Runtime Exception///////
//Arithmetic  Exception
//Null pointer Exception
//Number Format Exception
//ArryaIndex out of bound Exception