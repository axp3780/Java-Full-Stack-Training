
public class EsceptionDemo3 {

	public static void main(String[] args) {
		
		//this is for Number Format Exception
		
		try {
			String s = "abc";
			//cannot store string in the integer datatype
			int i = Integer.parseInt(s);
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("This is end of the program");

	}

}

///////These are the types of Runtime Exception///////
//Arithmetic  Exception
//Null pointer Exception
//Number Format Exception
//ArryaIndex out of bound Exception