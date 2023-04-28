

public class ReverseString {
	public static void main(String[] args) {
		//the string will be initiated in java heap
		String name = new String ("Arjun");
		
		int len = name.length();
		String temp ="";
		
		for (int x=0; x<len; x++) {
			char mych = name.charAt(x);
			temp = mych+temp;
			
		}
		
		System.out.println("Reverse of the string is: "+temp);
	}

}
