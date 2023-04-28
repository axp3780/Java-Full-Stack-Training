//if you do not declare the datatype while initializing arrayList, you can store different datatypes inside of it
//you can store duplicate data in the arraylist
//unlike array you do not have to declare the size of the array
//default size of the arraylist is 10
//if you store more than 10 data there is a formula for it

//c = (oc*3)/2   +1
//c is capacity
//oc is old capacity

import java.util.ArrayList;

public class ExampleArrayList {

	public static void main(String[] args) {
		//Initialization of ArrayList with infinite space
		ArrayList<String> arrayList	= new ArrayList<String>();
		
		arrayList.add("Arjun");
		arrayList.add("Madan");
		arrayList.add("Aman");
		arrayList.add("Ram");
		
		for (String s: arrayList) {
			System.out.println(s);
		}
		
		System.out.println("--------------------------------------");
		
		ArrayList <Integer> arrayList2 = new ArrayList<Integer>();
		
		arrayList2.add(12);
		arrayList2.add(11);
		arrayList2.add(23);
		
		
		for (Integer x: arrayList2) {
			System.out.println(x);
		}
		
		System.out.println("--------------------------------------");
		
		ArrayList arrayList3 = new ArrayList();
		
		arrayList3.add(1);
		arrayList3.add("Arjun");
		arrayList3.add('q');
		//we can store data in specific index in ArrayList
		arrayList3.add(1, "Mike");
		
		
		
		System.out.println(arrayList3);

	}

}
