package practice;

public interface Flying {

    // メソッド（抽象メソッド）
    void fly();

    // defaultメソッド//    デフォルトメソッドを使用して,powerOffメソッドを定義
    default void powerOff() {
        System.out.println("飛んでいる場合は落下します。");
    }
}