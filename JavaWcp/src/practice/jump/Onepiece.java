package practice.jump;

//親クラスを継承
public class Onepiece extends Jump{
//	新たにフィールドを宣言
	private int count;

//	コンストラクタを作成
	public Onepiece(String name, String dream, int count) {
		super(name, dream);
		this.count = count;
	}
	
//	メソッドを作成
	public String getProfile() {
//		ここで新たに値を作成（異なる結果になる値）
		String profile = super.dream + "に俺はなる！！";
		profile += "仲間" + this.count + "人は欲しいな";
//		戻り値を設定
		return profile;
	}
}
