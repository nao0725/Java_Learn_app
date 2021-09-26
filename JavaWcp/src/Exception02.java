
public class Exception02 {
	public static void main(String[] args) {
		try {
			System.out.println("100 ÷ 5 は？");
			int result = 100/0;
			System.out.println("計算結果" + result);
		} catch(ArithmeticException f) {
			System.out.println("例外が発生！");
		} 
			System.out.println("プログラム終了");
	}
}
