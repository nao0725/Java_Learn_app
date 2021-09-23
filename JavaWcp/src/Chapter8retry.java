
public class Chapter8retry {
	public static void main(String[] args) {
//		配列の変数を初期化（数字は適当）
		int[] array = { 1, 22, 333, 4444 };
//		配列の要素の変数を定義
		int i;
//		配列の要素をゼロにして初期化
//		lengthメソッドで配列のサイズ分（５文字）より小さい数を条件とする
//		iが１ずつインクリメントする
		for (i = 0; i < array.length; i++) {
//		１つ目の配列から順番に出力していく
			System.out.println(array[i]);
		}
		
		for(int number : array) {
			if(number % 2 == 0) {
				continue;
			}
			System.out.println(number);
		}
	}
}
