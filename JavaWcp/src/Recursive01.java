
public class Recursive01 {
	public static void main(String[] args) {
		int number = 1;
		printNum(number);
	}

	private static int printNum(int number) {
		// TODO 自動生成されたメソッド・スタブ
		if (number < 50) {
			number *= 2;
			System.out.println("While01 = " + number);
			printNum(number);
		}
		return number;
	}
}
