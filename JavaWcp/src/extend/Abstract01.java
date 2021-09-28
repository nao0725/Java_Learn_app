package extend;

import extend.animal.Cat;
import extend.animal.Dog;

public class Abstract01 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat();
		dog.cry();
		
		Cat cat = new Cat();
		cat.eat();
		cat.cry();

	}
}
