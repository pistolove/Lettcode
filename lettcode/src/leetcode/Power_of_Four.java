package leetcode;

import org.junit.Test;

public class Power_of_Four {

	public static boolean isPowerOfFour(int num) {
		if (num <= 0)
			return false;

		if (num == 1)
			return true;

		while (true) {
			if (num % 4 == 0) {
				num = num / 4;
				if (num == 1)
					return true;
			} else {
				return false;
			}
		}
	}

	@Test
	public void t1() {
		System.err.println((400 & (400 >> 2)) % 4);
	}
}
