package work7.animal;

import java.io.Serializable;

public class Dog implements Serializable {
	private String name;
	//用final將UID固定，表示相同來源
	private static final long serialVersionUID = 1L;
	
	public Dog(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("This is Dog " + name + " speaking.");
	}
}
