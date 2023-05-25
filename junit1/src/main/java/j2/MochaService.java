package j2;

public class MochaService {

	private MathUtil mathUtil = new MathUtil();
	
	public int compute(int num) {
		if (num<0) {
			throw new RuntimeException("Num cannot be negative");
		}
		int rand = mathUtil.findRandNum();
		rand= rand +9+(num*num);
		return rand;
	}
}
