package headfirst.design.adapter.extend;

public class MouseAdapter extends MouseListenerImpl implements MouseLinstener{

	@Override
	public void mouseClick() {
		System.err.println("after miouseClick");
	}

	@Override
	public void mouseDarg() {
		System.err.println("after drag");
	}

	
}
