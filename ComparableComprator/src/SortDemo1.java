import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

//manual/custom sorting can be implement by creating the class
class SortByName implements Comparator <Dog>{

	@Override
	public int compare(Dog o1, Dog o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}



public class SortDemo1 {
	
	public static void main(String[] args) {
		
		Dog d1 = new Dog("Puppy",1,"white");
		Dog d2 = new Dog("Badal",2,"Red");
		Dog d3 = new Dog("Z",3,"Black");
		Dog d4 = new Dog("Pup",4,"Purple");
		Dog d5 = new Dog("life",5,"Blue");
		
		
		Set<Dog> dogs = new TreeSet<Dog>(new SortByName());
		dogs.add(d1);
		dogs.add(d2);
		dogs.add(d3);
		dogs.add(d4);
		dogs.add(d5);

		
		for (Dog dd:dogs) {
			System.out.println(dd);
		}
		
	}

}
