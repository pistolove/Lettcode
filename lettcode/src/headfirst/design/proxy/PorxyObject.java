package headfirst.design.proxy;

public class PorxyObject implements Itraget{
	private Itraget target;
	
	PorxyObject(Itraget tItraget) {
		this.target = tItraget;
	}
	
	
	@Override
	public void say() {
		this.target.say();
	}

}
