package headfirst.design.adapter;

public class Women implements IWomen {

	@Override
	public void run() {
		System.err.println("women run slow");

	}

	@Override
	public void sleep() {

		System.err.println("women need to sleep");
	}

	@Override
	public void creatBaby() {
		System.err.println("women can create baby");

	}

}
