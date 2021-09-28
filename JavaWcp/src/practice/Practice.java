package practice;

public class Practice {
	public static void main(String[] args) {
//		「NoCapsule.java」を「Capsule.java」に変更
		Capsule eat = new Capsule("ラーメン", 1);
//		getterで定義した変数を使用する
		System.out.println("好きな食べ物は" + eat.getFood() + "です。");
		System.out.println("週に" + eat.getCount() + "回食べています。");
//		setterで値を変更
//		引数に変更する値を代入
		eat.setCount(2);
		System.out.println("最近は週に" + eat.getCount() + "回食べるようになりました。。。");
	}
}