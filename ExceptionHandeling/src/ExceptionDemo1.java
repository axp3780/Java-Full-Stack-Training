
public class ExceptionDemo1 {

	public static void main(String[] args) {
		
		//this is arithmetic exception
		try {
			int x = 1000/0;
		}
		catch (Exception e){
			
			System.out.println("This is for arithmatic exception");
		}
		System.out.println("End of Program");
	}

}



///////These are the types of Runtime Exception///////
//Arithmetic  Exception
//Null pointer Exception
//Number Format Exception
//ArryaIndex out of bound Exception
