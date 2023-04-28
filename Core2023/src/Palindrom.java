import java.util.Scanner;
public class Palindrom {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = input.nextLine();
	
		while ( !str.equals("Done")){
			String reversedStr = "";
			for(int i = str.length()-1; i>=0;i--) {
				reversedStr += str.charAt(i);    
				
				
			}
			
			if (str.equals(reversedStr)) {
				System.out.println(str+" is Palindrome");
			}
			else {
				System.out.println(str+" is not Palindrome");
			}
			
			System.out.println("Enter the string: ");
			str = input.nextLine();
		}
		
		
		

	}

}
