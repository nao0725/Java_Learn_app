package practiceMethod;

import practice.Car;

public class Chapter09 {
	public static void main(String[] args) {
	    // 燃費（Km/L）
	    double val = 12.5;
	    // 残量（L）
	    double cost = 55.0;
		
		Car car = new Car(val,cost);
		car.distance(100);
		System.out.println("残量は、" + car.amount() + "です");
	}
}