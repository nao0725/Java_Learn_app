package practice;

public class Car {
	private double val;
	private double cost;
	
	public Car(int distance, double val, double cost) {
		this.val = val;
		this.cost = cost;
	}

	public void distance(int km) {
		System.out.println(km + "km走ります");
		this.cost -= (km/val);
	}
	
	public double amount() {
		return this.cost;
	}
}
