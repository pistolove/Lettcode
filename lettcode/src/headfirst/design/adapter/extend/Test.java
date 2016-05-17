package headfirst.design.adapter.extend;

public class Test {

	public static void main(String[] args) {
		MouseLinstener adapter = new MouseAdapter();
		adapter.mouseClick();
		adapter.mouseDarg();
		adapter.mouseMove();
	}
}
