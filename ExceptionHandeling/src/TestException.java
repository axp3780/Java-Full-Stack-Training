
public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		int x = 10;
		try {
			int y = x/0;
		}
		catch(Exception e) {
			System.out.println("Exception Caught");
		}
		
		
		//finally should be used to keep a code which is necessary for  execution
		//code present in finally always executes either or not there is exception
		finally {
			System.out.println("This is from Finally Block");
		}
		/*
		 * System.out.println(x); //System.out.println(y);
		 */	

	}

}
