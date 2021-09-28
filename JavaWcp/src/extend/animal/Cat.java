package extend.animal;

public class Cat extends Animal {

	public Cat() {
		this.name = "猫";
	}
	
	public void cry() {
		System.out.println(this.name + "が吠えました！にゃーにゃー");
	}

}

