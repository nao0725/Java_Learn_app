package extend.phone;

//インターフェースを継承（Phone)継承元ではinterface, 子クラスではimplimentsを使う
public class MobilePhone implements Phone {
//	フィールドを定義
	private String number;
//	Mobilephone,takePivctureそれぞれメソッドを定義
	public MobilePhone(String number) {
		this.number = number;
	}
	public void takePicture() {
		System.out.println("写真を取ります");
	}
//	callはPhoneで作成したメソッドを継承している
	public void call(String number) {
		System.out.println(this.number + "から"+  number + "に電話をかけます。");
		
	}
}
