import java.util.Comparator;

public class Dog implements Comparable<Dog>{
	
		private String name;
		private int age;
		private String color;
		
		
		//Constructor using fields
		public Dog(String name, int age, String color) {
			super();
			this.name = name;
			this.age = age;
			this.color = color;
		}
		
		
		//getters and setters 
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}



		@Override
		public String toString() {
			return "Dog [name=" + name + ", age=" + age + ", color=" + color + "]";
		}


		@Override
		public int compareTo(Dog o) {
			return name.compareTo(o.name);
		}


		

		



		
	
		
		
		
}
