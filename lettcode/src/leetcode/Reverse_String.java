package leetcode;

public class Reverse_String {
	public static void main(String[] args) {

		System.err.println(reverse("hello words"));
	}

	public static String reverseString(String s) {
		if (s == null)
			return null;
		StringBuffer buffer = new StringBuffer(s);
		buffer.reverse();
		return buffer.toString();
	}

	public static String reverse(String s) {
		if (s == null)
			return null;
		int count = s.length();
		int n = count - 1;
		char[] value = s.toCharArray();
		for (int j = (n - 1) >> 1; j >= 0; j--) {
			int k = n - j;
			char cj = value[j];
			char ck = value[k];
			value[j] = ck;
			value[k] = cj;
		}

//		for (int i = 0; i < count - 1; i++) {
//			char c2 = value[i];
//			char c1 = value[i + 1];
//			value[i++] = c1;
//			value[i] = c2;
//		}

		return new String(value);
	}
}
