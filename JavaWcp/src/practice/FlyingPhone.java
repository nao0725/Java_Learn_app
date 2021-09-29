package practice;

import extend.phone.Phone;

public class FlyingPhone implements Phone, Flying {
    private int count;
    
	public FlyingPhone(int count) {
		this.count = count;
	}
    
	public void fly() {
		System.out.println(count + "分間飛びます");
	}

	public void call(String number) {
		System.out.println(number + "に電話します。通話できるのは飛んでいる間だけです.");
	}

	public void powerOff() {
		Flying.super.powerOff();
	}   
}