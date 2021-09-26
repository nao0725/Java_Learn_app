	package practiceMethod;

	import java.sql.SQLException;
	
	public class Chapter10 {
	    public static void main(String[] args) throws SQLException {

	        try {
	            int array[] = { 1, 3, 5,7};
	            Chapter10.validIndex(array, 2);
	            Chapter10.validIndex(array, 3);

	            System.out.println("validIndexの呼び出し終了");
	        } catch (IllegalArgumentException e) {
	            System.out.println("IllegalArgumentExceptionが発生しました");
	            e.printStackTrace();
	        }

	        // try-catch文を記述
	        // ・throwSQLExceptionメソッドを呼び出し
	        // ・SQLExceptionをキャッチして、メッセージとスタックトレースを出力
	        // ・"throwSQLExceptionの呼び出し終了"のメッセージを出力
	        try {
	        	Chapter10.throwSQLException();
	        } catch(SQLException e) {
	        	System.out.println("SQLExceptionが発生しました");
//	        	throw e;
	        	 e.printStackTrace();
	        }
	        System.out.println("mainメソッド終了");
	    }

		// validIndexメソッドを作成
	    // ・indexがarrayのサイズの範囲内なら、インデックスの要素を出力
	    // ・サイズの範囲外なら、IllegalArgumentExceptionをスロー

	    private static void validIndex(int[] array, int i) {
			if(array.length <= i) {
				throw new IllegalArgumentException(i + " はサイズの範囲外です");
			}
			System.out.println("インデックス" + i + "の要素は" + array[i] + "です");
		}
	    
	    
	    public static void throwSQLException() throws SQLException {
	        throw new SQLException("SQLエラーです");
	    }
	}

