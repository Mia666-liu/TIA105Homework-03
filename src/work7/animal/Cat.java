package work7.animal;

import java.io.Serializable;

public class Cat implements Serializable {
	private String name;
	//用final將UID固定，表示相同來源
	private static final long serialVersionUID = 1L;
	
	public Cat(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("This is Cat " + name + " speaking!");
	}
	
}
