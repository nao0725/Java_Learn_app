
public class Chapter8retry {
    public static void main(String[] args) {
//    	変数numberを定義する
        int number = 1;
//      「１以上５未満」なので４以下の数字を条件式に入れる
        while (number < 5){
//        	「二乗」を表すために変数同士をかける ex 2の二乗＝ 2*2
        	System.out.println(number * number);
//        	numberが１つずつインクリメント（増加）し、3乗、4乗と増えていく
        	number++;
        } 
    }
}
