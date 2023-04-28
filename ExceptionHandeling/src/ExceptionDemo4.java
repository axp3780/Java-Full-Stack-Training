
public class ExceptionDemo4 {

	public static void main(String[] args) {
		
		//This is for ArrayIndex out of bound Exception
		
		int a[]= new int[5];
		try {
			//array does not have 10th place to store the value 
			//this is why it will show the exception
			a[10]= 50;
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("End of the Program");

	}

}


///////These are the types of Runtime Exception///////
//Arithmetic  Exception
//Null pointer Exception
//Number Format Exception
//ArryaIndex out of bound Exception
