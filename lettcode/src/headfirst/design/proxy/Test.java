package headfirst.design.proxy;

public class Test {
	public static void main(String[] args) {
		
		Itraget tItraget = new TargetObject();
		Itraget pItraget = new PorxyObject(tItraget);
		pItraget.say();
		
	}
}
