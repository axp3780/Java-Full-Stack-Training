package j2;

import java.util.Random;

public class MathUtil {

	public int findRandNum() {
		return new Random().nextInt(1000)-3;
	}
}
