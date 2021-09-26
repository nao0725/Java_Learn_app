package practiceMethod;

//パッケージが違う場合はインポートしないと変数やメソッド使えない
import practice.Recar;

public class Repractice {

	    public static void main(String[] args) {
//	    	ここで出力する数値を定義
	        // 燃費（Km/L）
	        double cost = 12.5;
	        // 残量（L）
	        double val = 55.0;

	        Recar car = new Recar(cost, val);

	        car.move(20);
	        System.out.println("残量は、" + car.amount() + "です");
	}
}
