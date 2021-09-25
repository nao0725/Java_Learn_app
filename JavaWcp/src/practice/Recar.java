package practice;

public class Recar {
//		以下メンバー変数を定義　小数も扱うのでデータ型はdouble
//		アクセス修飾子をprivate指定（この中だけでしか使えない）publicならどこからでも使えた
	    // 燃費（Km/L）
	    private double cost;
	    // 残量（L）
	    private double val;

	    // コンストラクタを作成する 引数は上記で指定した変数
	    public Recar(double cost, double val) {
//	    	インスタンスそれ自身を表すキーワード
	    	this.cost = cost;
	    	this.val = val;
	    }

	    // moveメソッドを定義する
	    // ・"xx km 走ります"を出力
	    // ・残量を計算
//	    voidメソッドは戻り値がないメソッドで指定する特別な型
	    public void move(int km) {
//	    	ここで出力する値を定義moveメソッドを使ってどこからでも呼び出せる
	    	System.out.println(km + "走ります。");
//	    	残量から走った文の燃料を計算
	    	this.val -= (km / cost);
	    }

	    // costを取得するメソッドを作成
//	    もし7行目で定義したcostの修飾子がpublicならここで定義しなくてよかった
	    public double amount() {
	        return this.val;
	    }
	}
