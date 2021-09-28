package practice;
//「NoCapsule.java」を「Capsule.java」に変更
public class Capsule {
//	アクセス修飾子をpublicからprivavteに変更
	private String food;
	private int count;

	public Capsule(String food, int count) {
		this.food = food;
		this.count = count;
	}
//	実行ファイルで使用できるようにpublicで定義
	public String getFood() {
		return food;
	}
//	getterはフィールドの値を取得できるようにするメソッド
	public int getCount() {
		return count;
	}
//	setterはメソッドや値を変更するメソッド
	public void setCount(int count) {
		this.count = count;
	}
}
