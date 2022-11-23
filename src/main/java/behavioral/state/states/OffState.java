package behavioral.state.states;

import behavioral.state.HeadPhone;

public class OffState implements HPState {
	private static final HPState instance = new OffState();
	private OffState() {}

	@Override
	public void click(HeadPhone hp) {
		//Nothing to do!
	}

	@Override
	public void longClick(HeadPhone hp) {
		hp.setOn(true);
		System.out.println("> Turning On");
		hp.setState(OnState.getInstance());
	}

	public static HPState getInstance() {
		return instance;
	}

}
