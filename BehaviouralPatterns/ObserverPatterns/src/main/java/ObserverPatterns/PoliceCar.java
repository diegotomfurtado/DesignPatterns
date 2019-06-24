package ObserverPatterns;

import java.util.Observable;
import java.util.Observer;

public class PoliceCar implements Observer, Car {

	@Override
	public void front() {
		System.out.println("Police car go ahead");
	}

	@Override
	public void right() {
		System.out.println("Police car turned right");
	}

	@Override
	public void left() {
		System.out.println("Police car turned left");
	}

	@Override
	public void stop() {
		System.out.println("Police car stopped");
	}

	public void update(Observable observable, Object object) {

		String action = String.valueOf(object);

		if (action.equals("front")) {
			this.front();

		} else if (action.equals("right")) {
			this.right();

		} else if (action.equals("left")) {
			this.left();

		} else if (action.equals("stop")) {
			this.stop();

		}
	}

}
