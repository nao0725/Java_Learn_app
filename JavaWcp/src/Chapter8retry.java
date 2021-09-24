
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
		
//		数値のデータ型の変数numberに配列を代入
		for(int number : array) {
//			偶数＝２で割ったときに０になる数なので、%で割った値が０と等しいことを条件にする
			if(number % 2 == 0) {
//				 偶数の場合処理をスキップする
				continue;
			}
			System.out.println(number);
		}
	}
}
