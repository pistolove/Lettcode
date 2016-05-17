package headfirst.design.adapter;

public class Adapter implements IWomen {
	private IMen men;

	public Adapter(IMen men) {
		super();
		this.men = men;
	}

	@Override
	public void run() {
		men.run();
	}

	@Override
	public void sleep() {
		men.sleep();
	}

	@Override
	public void creatBaby() {
		men.groupBaby();
	}

}
