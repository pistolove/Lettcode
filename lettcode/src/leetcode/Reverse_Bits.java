package leetcode;

public class Reverse_Bits {
	// you need treat n as an unsigned value
	public int reverseBits(int n) {
		int value = 0;
		for (int i = 0; i < 32; ++i) {
			if ((n & 1) == 1) {
				value = (value << 1) + 1;
				n >>= 1;
			} else {
				value = value << 1;
				n >>= 1; //右移
			}
		}

		return value;
	}
	
	public static void main(String[] args) {
		System.err.println();
	}
}
