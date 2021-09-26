package practiceMethod;

import java.sql.SQLException;

public class Practice {
	public static void main(String[] args) throws SQLException {
//		try-catch文で例外を発生させる
		try {
//        	配列が３つのサイズ　それそれvalidIndexというメソッドを作成して定義
			int array[] = { 1, 3, 5 };
//          29行目からメソッド定義
			Practice.validIndex(array, 2);
			Practice.validIndex(array, 3);
//          例外が発生しなかった場合に出力
			System.out.println("validIndexの呼び出し終了");
//          例外クラス,変数名を引数に入力
		} catch (IllegalArgumentException e) {
//        	例外発生時に引数を出力する
			System.out.println("IllegalArgumentExceptionが発生しました");
			e.printStackTrace();
		}

		// try-catch文を記述/throwSQLExceptionメソッドを呼び出し
		try {
			throwSQLException();
			// ・SQLExceptionをキャッチして、メッセージとスタックトレースを出力
		} catch (SQLException s) {
			System.out.println("SQLエラーです");
			throw s;
		}
		// ・"throwSQLExceptionの呼び出し終了"のメッセージを出力
		System.out.println("throwSQLExceptionの呼び出し終了");
		System.out.println("mainメソッド終了");
	}

	// validIndexメソッドを作成
	private static void validIndex(int[] array, int index) {
//    	if文で条件が合致した際に「 index はサイズの範囲外です」を出力する
//		配列のサイズはlengthメソッドを使用　列のサイズは3で3と条件に合致しているので下記の文が出力される
		if (array.length <= index) {
			// サイズの範囲外なら、IllegalArgumentExceptionをスロー
//			49行目のSQLExceptionを使用
			throw new IllegalArgumentException(index + "はサイズの範囲外です");
		}
		// indexがarrayのサイズの範囲内なら、インデックスの要素を出力
		System.out.println("インデックス" + index + "の要素は" + array[index] + "です");
	}

	public static void throwSQLException() throws SQLException {
		throw new SQLException("SQLエラーです");
	}
}
