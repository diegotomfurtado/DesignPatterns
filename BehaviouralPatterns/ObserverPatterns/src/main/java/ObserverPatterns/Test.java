package ObserverPatterns;

public class Test {
	
	public static void main(String[] args) {
		
		PoliceCar policeCar = new PoliceCar();
		StolenCar stolenCar = new StolenCar();
		
		stolenCar.addObserver(policeCar);
		
		stolenCar.front();
		stolenCar.right();
		stolenCar.left();
		stolenCar.stop();
		
	}
}
