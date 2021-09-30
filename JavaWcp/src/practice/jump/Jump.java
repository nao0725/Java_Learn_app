package practice.jump;

public class Jump {
//	フィールドメソッドを定義
	private String name;
	protected String dream;

//	コンストラクタを作成
	public Jump(String name, String dream) {
		this.name = name;
		this.dream = dream;
	}
	
//	final修飾子をつけることで他で使えなくする（オーバーライド禁止）
	final public String getName() {
		return this.name;
	}
	
//	それぞれ子クラスで使うメソッドを作成
	public String getDeream() {
		return this.dream;
	}
	
	public String getProfile() {
		return "俺の名は" + this.name + "!" + this.dream + "に俺はなる！！";
	}
}
