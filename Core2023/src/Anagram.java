import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String str1 = "nsa";
		String str2 = "ans";
		
		if (str1.length() != str2.length()) {
			System.out.println("Its not anagram");
			return; //means do not do anything
			
		}
		
		char arr1[]=str1.toCharArray();
		char arr2[]= str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		boolean b= Arrays.equals(arr1,arr2);
		if (b) {
			System.out.println("Strings are anagram");
		}else {
			System.out.println("Strings are not anagram");
		}

	}

}
