package practice;

import extend.phone.Phone;
//PhoneとFlyingからそれぞれ継承（インターフェースを実装）
public class FlyingPhone implements Phone, Flying {
//	新たにフィールドを宣言
    private int count;
    
	public FlyingPhone(int count) {
		this.count = count;
	}
//    抽象メソッドから持ってきている
	public void fly() {
		System.out.println(count + "分間飛びます");
	}
//	callはPhoneから持ってきている
	public void call(String number) {
		System.out.println(number + "に電話します。通話できるのは飛んでいる間だけです.");
	}
//	defaultメソッドから実装(親元から持ってくるときはsuper変数を使う)
	public void powerOff() {
		Flying.super.powerOff();
	}   
}