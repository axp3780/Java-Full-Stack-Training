
public class M {
	
	int i;
	
	public M(int i) {
		this.i = i--;
		
	}
}
 
class N extends M{
	public N(int i) {
		super(++i);
		
		System.out.println(i);
	}
}

