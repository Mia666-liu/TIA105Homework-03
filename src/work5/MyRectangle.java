package work5;

// 請設計一個類別MyRectangle：
//(1) 有兩個double型態的屬性為width, depth
//(2) 有三個方法：
//(3) 有兩個建構子：
//請另外建立一個MyRectangleMain類別，此類別只有main方法

public class MyRectangle {
	private double width;
	private double depth;
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setDepth(double depth) {
		this.depth = depth;
	}
	
	public double getArea() {
		return width * depth;
	}
	
	public MyRectangle() {
		
	}
	
	public MyRectangle(double width, double depth) {
		this.width = width;
		this.depth = depth;
	}
}
	
