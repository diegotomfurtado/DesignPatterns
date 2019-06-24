package ObserverPatterns;

import java.util.Observable;

public class StolenCar extends Observable implements Car {

	String action = "";

	@Override
	public void front() {

		action = "front";
		System.out.println("Stolen car following ahead!");

		this.changeState();
	}

	@Override
	public void right() {

		action = "right";
		System.out.println("The stolen car turned right!");

		this.changeState();
	}

	@Override
	public void left() {

		action = "left";
		System.out.println("The stolen car turned left!");

		this.changeState();
	}

	@Override
	public void stop() {

		action = "stop";
		System.out.println("The stolen car has stopped!");

		this.changeState();
	}

	public void changeState() {

		setChanged();
		notifyObservers(action);
	}

}
