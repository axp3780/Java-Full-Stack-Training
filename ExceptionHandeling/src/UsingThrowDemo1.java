//throw is used to deliberately throw an exception
//throw and throws are different
//"throw" is used to manually throw an exception
//"throws" is used in a method declaration to indicate that the method might throw an exception.

import java.util.*;
import java.lang.RuntimeException;

public class UsingThrowDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please Enter Your name: ");
		//name must be alphabetic only
		String name = scan.nextLine();
		
		//use if/else instead
		while (!name.equals("Done")) {
			//Scanner scan1 = new Scanner(System.in);
			System.out.print("Please Enter your Password: ");
			String password = scan.nextLine();
			
			
			
			try {
				printException(name,password);
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			System.out.print("Please Enter Your name: ");
			name = scan.nextLine();
			
			
			}
		
		
		System.out.println("End of the Program");
		}
	
	
	
	
	//throws and exception if name and password is same
	static void printException(String name, String pw) throws RuntimeException {
		if (name.equals(pw)) {
			RuntimeException rE = new RuntimeException("Your name and password cannot be same!");
			throw rE;
		}
		else {
			System.out.println("Welcome to the Runtime Exception Class: "+name);
		}
		
	}
	
	}
		
